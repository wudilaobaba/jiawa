package come.tedu.webserver.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Arrays;

import come.tedu.webserver.http.HttpRequest;
import come.tedu.webserver.http.HttpResponse;

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
			HttpResponse response = new HttpResponse(socket);
			/*
			 * 通过request获取请求的资源路径，从webapps中寻找对应资源
			 */
			String str = request.getRequestURI();
			//判断是否请求注册业务
			if("/login".equals(str)){
				System.out.println("开始处理注册业务");
				/*
				 * 注册业务流程
				 * 1.通过reqest获取用户在注册页面上输入的注册信息
				 * 2.使用RandomAccessFile打开use.dat文件
				 * 3.将该用户信息写入文件
				 * 4.设置response,响应注册成功页面
				 */
				String userName = request.getParamter("userName");
				String psw = request.getParamter("psw");
				String nickName = request.getParamter("nickName");
				int age = Integer.parseInt(request.getParamter("age"));
				//对用户数据进行必要验证
				try{
					RandomAccessFile raf = new RandomAccessFile("./user.dat","rw");
					raf.seek(raf.length());
					raf.write(Arrays.copyOf(userName.getBytes("utf-8"), 32));
					raf.write(Arrays.copyOf(psw.getBytes("utf-8"), 32));
					raf.write(Arrays.copyOf(nickName.getBytes("utf-8"), 32));
					raf.writeInt(age);
					raf.close();
					response.setStatusCode(200);
					response.setEntity(new File("./webapps/myweb/success.html"));
				}catch(Exception e){
					e.printStackTrace();
				}
			}else{
				File file = new File("webapps"+str);			
				if(file.exists()){
					System.out.println("资源已找到"+str);
					response.setStatusCode(200);
					response.setEntity(new File("./webapps"+str));
				}else{
					System.out.println("资源未找到"+str);
					response.setStatusCode(404);
					response.setEntity(new File("./webapps/myweb/404.html"));
				}
			}
			//响应客户端
			response.flush();
		}catch(EmptyRequestException e){
			System.out.println("空请求来了");  //会继续走到finally中，与客户端断开连接
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
