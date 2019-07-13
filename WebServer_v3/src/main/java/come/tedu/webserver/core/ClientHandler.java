package come.tedu.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import come.tedu.webserver.http.HttpRequest;

/**
 * 处理客户端请求的线程任务
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
		 *处理该客户端的请求的大致步骤：
		 *1.解析请求
		 *2.处理请求
		 *3.给予响应 
		 */
		
		
		try {
			//1.解析请求，生成HttpRequest对象
			HttpRequest request = new HttpRequest(socket);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	/**
	 * 通过给定的输入流读取一行字符串(以CRLF结尾)
	 * @param in
	 * @return 
	 */
	public String readLine(InputStream in){
		StringBuilder builder = new StringBuilder();
		try {
			int d=-1;
			//c1表示上次读到的字符，c2表示本次读到的字符
			char c1 = 'a' , c2 = 'a';
			while((d=in.read())!=-1){
				c2 = (char)d;
				/*
				 * 在ASC编码中，CR的编码对应的数组为13  LF编码对应的数字为10
				 * 就好比字符a的编码对应的数字为97
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
