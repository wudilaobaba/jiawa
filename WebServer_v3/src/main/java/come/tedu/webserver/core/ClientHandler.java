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
	/**
	 * ͨ����������������ȡһ���ַ���(��CRLF��β)
	 * @param in
	 * @return 
	 */
	public String readLine(InputStream in){
		StringBuilder builder = new StringBuilder();
		try {
			int d=-1;
			//c1��ʾ�ϴζ������ַ���c2��ʾ���ζ������ַ�
			char c1 = 'a' , c2 = 'a';
			while((d=in.read())!=-1){
				c2 = (char)d;
				/*
				 * ��ASC�����У�CR�ı����Ӧ������Ϊ13  LF�����Ӧ������Ϊ10
				 * �ͺñ��ַ�a�ı����Ӧ������Ϊ97
				 */
				if(c1==13&&c2==10){
					
					break;
				}
				builder.append(c2);
				c1 = c2;
			}
			return builder.toString().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
