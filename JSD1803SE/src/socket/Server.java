package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 * @author Administrator
 *
 */
public class Server {
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
	public Server(){
		try {
			System.out.println("启动服务器");
			server = new ServerSocket(8085);
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
			System.out.println("等待客户端连接....");
			//一旦有客户端介入，就返回一个Socket,这样两端就各有一个socket了，是一个对等关系，相当于两端都有一个电话了
			Socket socket = server.accept(); 
			System.out.println("一个客户端连接了");
			
			//...阻塞中....
			
			//************************ 一旦客户端有数据进入，则执行以下代码：******************************
			InputStream in = socket.getInputStream();
			//以下简记为->读入：IB.readLine();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");//两边编码格式必须一致
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			while(true){
				System.out.println("daddasddasdasdasd");
				str= br.readLine();//读出带换行符的字符串  //***readLine()是阻塞方法***
				System.out.println("客户端说："+str);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
}
