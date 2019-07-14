package come.tedu.webserver.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
			
			//2.处理请求
			/*
			 * 通过request获取请求的资源路径，从webapps中寻找对应资源
			 */
			String str = request.getUrl();
			System.out.println("webapps"+str);
			File file = new File("webapps"+str);
			OutputStream out = socket.getOutputStream();
			if(file.exists()){
				System.out.println("资源已找到");
				send("200","OK","text/html",file,out);
				/*
				 * 以一个标准的http响应格式回复客户端该资源
				 */
				//发送状态行
//				String line = "HTTP/1.1 200 OK";
//				out.write(line.getBytes("ISO8859-1"));
//				out.write(13); //CR
//				out.write(10); //LF
//				
//				//发送响应头
//				line = "Content-Type: text/html"; //回的是文本类中的html文本
//				out.write(line.getBytes("ISO8859-1"));
//				out.write(13); //CR
//				out.write(10); //LF
//				line = "Content-Length: "+file.length();
//				out.write(line.getBytes("ISO8859-1"));
//				out.write(13); //CR
//				out.write(10); //LF
//				//表示响应头部分发送完毕
//				out.write(13); //CR
//				out.write(10); //LF
//				
//				//发送响应正文：
//				FileInputStream fis = new FileInputStream(file);
//				byte[] b = new byte[1024*10];
//				int len = -1;
//				while((len=fis.read(b))!=-1){
//					out.write(b,0,len);
//				}
			}else{
				System.out.println("资源未找到");
				file = new File("./webapps/myweb/404.html");
				send("404","whj","text/html",file,out);
				//发送状态行
//				String line = "HTTP/1.1 404 whj";
//				out.write(line.getBytes("ISO8859-1"));
//				out.write(13); //CR
//				out.write(10); //LF
//				
//				//发送响应头
//				line = "Content-Type: text/html"; //回的是文本类中的html文本
//				out.write(line.getBytes("ISO8859-1"));
//				out.write(13); //CR
//				out.write(10); //LF
//				line = "Content-Length: "+file.length();
//				out.write(line.getBytes("ISO8859-1"));
//				out.write(13); //CR
//				out.write(10); //LF
//				//表示响应头部分发送完毕
//				out.write(13); //CR
//				out.write(10); //LF
//				
//				//发送响应正文：
//				FileInputStream fis = new FileInputStream(file);
//				byte[] b = new byte[1024*10];
//				int len = -1;
//				while((len=fis.read(b))!=-1){
//					out.write(b,0,len);
//				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//响应后与客户端断开连接
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @param code
	 * @param typedis
	 * @param file
	 * @param out
	 */
	public void send(String code,String typedis,String conTentType,File file,OutputStream out){
		try{
			/*
			 * 以一个标准的http响应格式回复客户端该资源
			 */
			
			//发送状态行
			String line = "HTTP/1.1 "+code+" "+typedis;
			out.write(line.getBytes("ISO8859-1"));
			out.write(13); //CR
			out.write(10); //LF
			
			//发送响应头
			line = "Content-Type: "+conTentType; //回的是文本类中的html文本
			out.write(line.getBytes("ISO8859-1"));
			out.write(13); //CR
			out.write(10); //LF
			line = "Content-Length: "+file.length();
			out.write(line.getBytes("ISO8859-1"));
			out.write(13); //CR
			out.write(10); //LF
			//表示响应头部分发送完毕
			out.write(13); //CR
			out.write(10); //LF
			
			//发送响应正文：
			FileInputStream fis = new FileInputStream(file);
			byte[] b = new byte[1024*10];
			int len = -1;
			while((len=fis.read(b))!=-1){
				out.write(b,0,len);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
