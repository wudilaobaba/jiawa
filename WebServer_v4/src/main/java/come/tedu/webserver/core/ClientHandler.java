package come.tedu.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import come.tedu.webserver.http.HttpRequest;

/**
 * ����ͻ���������߳�����
 * @author Administrator
 *
 */
public class ClientHandler implements Runnable{
	private Socket socket;
	public ClientHandler(Socket socket){
		this.socket = socket;
	}
	public void run(){
		/*
		 *����ÿͻ��˵�����Ĵ��²��裺
		 *1.��������
		 *2.��������
		 *3.������Ӧ 
		 */
		try {
			//1.������������HttpRequest����
			HttpRequest request = new HttpRequest(socket);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
