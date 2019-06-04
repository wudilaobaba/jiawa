package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * 聊天室客户端 升级处：使用多线程
 * @author Administrator
 *
 */
public class Client02 {
	/*
	 *java.net.Scoket 套接字
	 *封装了TCP协议通讯。使用它可以很方便的以TCP协议为通讯方式进行数据传输 
	 */
	private Socket socket; //可以理解为一个电话
	//Socket在向服务端发请求的时候，把自己计算机的IP+端口号也带过去了，（服务端端口号是由Socket自动请求的，不需要人为设置）
	//然后服务端返回给客户端数据的时候，就按照服务端对应的IP+端口进行定位
	//通过IP地址可以找到服务端计算机，通过端口号可以找到运行在服务端计算机上的服务端应用程序
	public Client02(){
		try {
			//实例化Socket的过程就时是连接的过程，若连接失败那么这里会抛出异常
			System.out.println("正在连接服务器...");
			socket = new Socket("127.0.0.1",8087); //参数为IP与端口号，客户端想请求服务端，一定要找到对应服务端的IP+端口号
			System.out.println("已连接");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		try {
			//自己写的scanner
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					System.in
				)
			);
			
			//OutputStream是一个抽象类，虽然不能new来实例化，但是可以向上造型，父类可以指向子类***
			OutputStream out = socket.getOutputStream();//它是OutputStream的子类
			//以下简记为->写出：OBP.println(String str)
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
			BufferedWriter bs = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bs,true);
			
			//创建输入流读取服务端消息
			BufferedReader in = new BufferedReader(
				new InputStreamReader(
					socket.getInputStream(),"UTF-8"
				)
			);
			
			System.out.println("开始聊天吧");
			String str = null;
			while(true){
				str = br.readLine(); //***readLine()是阻塞方法***
				pw.println(str);//该句带上换行符并进行向服务器发送数据
				
				str = in.readLine();
				System.out.println(str);
			}
			
			//out.write(str.getBytes("utf-8"));//该句进行向服务器发送数据
//			pw.println(str);//该句带上换行符并进行向服务器发送数据
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client02 client = new Client02();
		client.start();
	}
}
