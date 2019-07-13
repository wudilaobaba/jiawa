package come.tedu.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer����
 * @author Administrator
 *
 */
public class WebServer {
	private ServerSocket server;
	public WebServer(){
		try{
			//TomcatĬ�Ͽ����Ķ˿ھ���8080
			server = new ServerSocket(8080);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void start() {
		try {
			//��ʱ�������ͻ�������
//			while(true){
				Socket socket = server.accept();
				//����һ���̣߳�����ÿͻ��˵�����
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
