package come.tedu.webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HttpResponse {
	private Socket socket;
	private OutputStream out;
	//状态代码
	private int statusCode;
	/*
	 * 响应头相关信息定义
	 */
	private Map<String,String> headers = new HashMap<String, String>();
	
	/*
	 * 响应正文相关信息定义
	 */
	//要响应的实体文件
	private File entity;
	public HttpResponse(Socket socket){
		try{
			this.socket = socket;
			this.out = socket.getOutputStream();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	/**
	 * 设置响应实体文件数据
	 * 该方法会自动添加对应的两个响应头Content-Type与Content-Length
	 * @param entity
	 */
	public void setEntity(File entity) {
		this.entity = entity;
		//添加响应头Content-Type
		//获取文件后缀名：
		String fileName = entity.getName();
		String ext = fileName.substring(entity.getName().lastIndexOf(".")+1);
		putHeaders("Content-Type",HttpContext.getMime(ext));
		//添加响应头Content-Length
		putHeaders("Content-Length",entity.length()+"");
	}

	/**
	 * 将响应内容按HTTP协议格式发送给客户端
	 */
	public void flush(){
		/*
		 * 响应客户端做三件事
		 * 1.发送状态行
		 * 2.发送响应头
		 * 3.发送响应正文
		 */
		sendStatusLine();
		sendHeaders();
		sendContext();
		
	}
	/**
	 * 发送状态行
	 */
	public void sendStatusLine(){
		String line = "HTTP/1.1 "+statusCode+" "+HttpContext.getStatusReason(statusCode);
		try {
			out.write(line.getBytes("ISO8859-1"));
			out.write(13); //CR
			out.write(10); //LF
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 发送响应头
	 */
	public void sendHeaders(){
		try{
			//以下四行允许跨域请求
			putHeaders("Access-Control-Allow-Origin","http://localhost:3000");
			putHeaders("Access-Control-Allow-Headers","Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
			putHeaders("Access-Control-Allow-Methods","PUT, POST, GET, DELETE, OPTIONS");
			putHeaders("Access-Control-Allow-Credentials","true");
			//遍历headers，将所有消息头发送至客户端
			Set<Entry<String,String>> set = headers.entrySet(); 
			for(Entry<String,String> header:set){
				String line = header.getKey()+": "+header.getValue();
				println(line);
			}
			println("");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 发送响应正文
	 */
	public void sendContext(){
		try {
			FileInputStream fis = new FileInputStream(entity);
			byte[] b = new byte[1024*10];
			int len = -1;
			while((len=fis.read(b))!=-1){
				out.write(b,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void println(String line){
		try {
			out.write(line.getBytes("ISO8859-1"));
			out.write(13); //CR
			out.write(10); //LF
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 添加一个响应头
	 * @param name 响应头的名字
	 * @param value 响应头对应的值
	 */
	public void putHeaders(String name,String value){
		headers.put(name,value);
	}
}
