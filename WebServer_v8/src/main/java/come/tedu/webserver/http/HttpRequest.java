package come.tedu.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import come.tedu.webserver.core.EmptyRequestException;

/**
 * HttpRequest表示一个	Http协议要求的请求信息
 * 一个请求包含三部分
 * 请求行、消息头、消息正文
 * @author Administrator
 *
 */
public class HttpRequest {
	//对应客户端的socket
	private Socket socket;
	//通过socket获取的输入流，用于读取客户端发送的请求
	private InputStream in;
	
	//请求行相关信定义
	//请求方式
	private String method;
	//资源路径
	private String url;
	//请求使用的协议版本
	private String protocol;
	//url中的部分请求
	private String requestURI;
	//url中的参数部分
	private String queryString;
	//url中所有参数
	//key参数名 value:参数值
	private Map<String,String> parameters = new HashMap<String,String>(); 
	
	//消息头相关定义
	private Map<String,String> headers = new HashMap();
	
	
	//只给以下三个提供三个get三个方法：
	public String getMethod() {
		return method;
	}
	public String getUrl() {
		return url;
	}
	public String getProtocol() {
		return protocol;
	}
	
	public String getRequestURI() {
		return requestURI;
	}
	public String getQueryString() {
		return queryString;
	}
	/**
	 * 根据给定的参数名获取对应的参数值
	 * @param name
	 * @return
	 */
	public String getParamter(String name){
		return this.parameters.get(name);
	}
	//提供获取消息头信息的方法
	public String getHeader(String name){
		return headers.get(name);
	}
	
	/**
	 * 实例化HttpRequest使用的构造方法，需要将对应的客户端的Socket传入，以便读取该客户端发送过来的请求内容
	 * @param socket  
	 * @throws EmptyRequestException 
	 */
	public HttpRequest(Socket socket) throws EmptyRequestException{
		try{
			this.socket = socket;
			this.in = socket.getInputStream();
			//1.解析请求行
			parseRequestLine();
			//2.解析消息头
			parseHeaders();
			//3.解析消息正文
			parseContent();
			//this socket = socket;
		}catch(EmptyRequestException e){
			//将空请求抛给ClientHandler
			throw e;
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	/**
	 * 解析请求行  不需要被外界调用就用private
	 * @throws EmptyRequestException 
	 */
	private void parseRequestLine() throws EmptyRequestException{
		/*
		 * 大致流程:
		 * 1.通过输入流读取第一行
		 * 2.将请求行按照空格拆分为三项
		 * 3.将拆分的三项分别设置到method,utl,protocol三个属性上
		 * 解析请求行时，在获取拆分后的数组元素时，可能会引发数组下标越界，这是由于HTTP协议允许客户端发送一个空请求过来导致的
		 */
		String[] str = readLine().split("\\s");
		//拆分请求行内容是否能达到三项
		if(str.length<3){
			//这是一个空请求
			throw new EmptyRequestException();
		}
		method = str[0];
		url = str[1];
		//进一步解析url部分
		parseURL();
		protocol = str[2];
		System.out.println("解析请求行");
		System.out.println(Arrays.toString(str));
	}
	/**
	 * 进一步对url进行解析
	 * 将url中的请求部分设置到属性requestURI上
	 * 将url中的参数部分设置到queryString上
	 * 在对参数部分进一步解析，将每个参数都存入到属性parameters中
	 * 若该url不含有参数部分，则直接将url的值赋值给requestURI，参数部分不做任何处理
	 */
	private void parseURL(){
		System.out.println("开始解析url:"+url);
		/*
		 *思路：
		 *url是否含有参数，可以根据该url中是否含有?来决定。若有则按照?拆分为两部分
		 *第一部分为请求部分，第二部分为参数部分
		 *设置到对应属性即可。然后再对参数进行拆分，最终将每个参数的名字作为key,值作为value存入到parameter中。
		 *若不含有参数，则直接将url赋值给requestURL即可。 
		 */
//		if(url.indexOf('?')!=-1){//若含有问号
//			
//		}
		if(url.contains("?")){
			String[] data = url.split("\\?");
			requestURI = data[0];
			if(data.length>1){//防止问号右边没值
				queryString = data[1];
				String[] query = queryString.split("\\&");
				for(String str : query){
					String[] m = str.split("\\=");
					if(m.length>1){//防止等号右边没值
						parameters.put(m[0], m[1]);
					}else{
						parameters.put(m[0], "");
					}
				}
			}
		}else{
			requestURI = url;
		}
		
		
		
		System.out.println("requestURI:"+requestURI);
		System.out.println("queryString:"+queryString);
		System.out.println("parameters:"+parameters);
		System.out.println("url解析完毕！");
	}
	/**
	 * 解析消息头  不需要被外界调用就用private
	 * 大致步骤：
	 * 1.继续使用readLine发发读取若干行内容
	 * 	 每一行应该都是一个消息头
	 * 2.当readLine方法返回值为空字符串时则停止循环读取工作(单独读到了CRLF时，readLine方法返回值应当是空字符串)
	 * 3.每当读取一个消息头信息时应当按照": "拆分为两项，第一项为消息头名字，第二项为消息头对应的值，将名字作为key,将值作为
	 * value存入到属性headers这个Map中
	 */
	private void parseHeaders(){
		System.out.println("解析消息头");
		while(true){
			String str = readLine();
			if("".equals(str)){
				break;
			}
			headers.put(str.split(":\\s")[0], str.split(":\\s")[1]);
		}
		System.out.println(headers);
//		
	}
	/**
	 * 解析消息正文  不需要被外界调用就用private
	 */
	private void parseContent(){
		System.out.println("解析消息正文");
	}
	
	/**
	 * 通过给定的输入流读取一行字符串(以CRLF结尾)
	 * @param in
	 * @return 
	 */
	private String readLine(){
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
