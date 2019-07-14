package come.tedu.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer主类
 * @author Administrator
 *
 */
public class WebServer {
	private ServerSocket server;
	public WebServer(){
		try{
			//Tomcat默认开启的端口就是8080
			server = new ServerSocket(8080);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void start() {
		try {
			//暂时不处理多客户端连接
//			while(true){
				Socket socket = server.accept();
				//启动一个线程，处理该客户端的请求
				Thread t = new Thread(new ClientHandler(socket));
				t.start();
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		WebServer server = new WebServer();
		server.start();
	}
}
