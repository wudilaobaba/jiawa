package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端  升级处：使用多线程
 * @author Administrator
 *
 */
public class Server01 {
	/**
	 * 运行在服务端的jave.net.ServerScoket
	 * 主要有两个作用：
	 * 1.向系统申请服务端口，客户端就是通过这个端口与服务端建立连接的
	 * 2.监听服务端口，等待客户端连接，那么ServerSocket会主动创建一个Socket与客户端进行通讯。
	 */
	private ServerSocket server;
	/**
	 * 用来初始化服务端
	 */
	public Server01(){
		try {
			System.out.println("启动服务器");
			server = new ServerSocket(8087);
			System.out.println("服务器启动完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 服务端开始工作的方法
	 */
	public void start(){
		//server.accept() 该方法会阻塞
		try {
			/**
			 * ServerSocket提供的方法：Socket accept()
			 * 该方法是一个阻塞方法，调用后进入阻塞，直到一个客户端连接为止，这时该方法返回一个Socket可以与刚建立连接的客户端进行通讯
			 */
			while(true){
				System.out.println("等待客户端连接....");
				//一旦有客户端介入，就返回一个Socket,这样两端就各有一个socket了，是一个对等关系，相当于两端都有一个电话了
				Socket socket = server.accept(); // 重点01.******此处只调用了一次，想要再接电话，就得再调一次
				// === 利用多线程： ===利用多线程来接电话，只要有客户端打进来就起一个线程去执行接受输入流代码
				System.out.println("一个客户端连接了");
				//启动线程:
				Thread t1 = new Thread(new ClientHandler(socket));
				t1.start();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server01 server = new Server01();
		server.start();
	}
	
	/**
	 * 该现程负责处理指定客户端的交互工作
	 * @author Administrator
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		public ClientHandler(Socket socket){
			this.socket = socket;
		} 
		public void run(){
			//以下接收输入流
			try {
				//以下简记为->读入：IB.readLine();
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");//两边编码格式必须一致
				BufferedReader br = new BufferedReader(isr);
				String str = null;
				while(true){// 重点02.***********此处的循环相当于一直不挂电话,这个while在一直一客户Tom保持联系！！！！！！！
					str= br.readLine();//读出带换行符的字符串  //***readLine()是阻塞方法***
					System.out.println("客户端说："+str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
