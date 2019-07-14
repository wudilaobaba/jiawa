package come.tedu.webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class HttpResponse {
	private Socket socket;
	private OutputStream out;
	//状态代码
	private int statusCode;
	//状态描述
	private String statusDis;
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

	public void setStatusDis(String statusDis) {
		this.statusDis = statusDis;
	}

	public void setEntity(File entity) {
		this.entity = entity;
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
		String line = "HTTP/1.1 "+statusCode+" "+statusDis;
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
			String line = "Content-Type: text/html";
			println(line);
			line = "Content-Length: "+entity.length();
			println(line);
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
	
}
