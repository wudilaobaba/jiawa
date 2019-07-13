package come.tedu.webserver.http;

import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

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
	
	//消息头相关定义
	private Map<String,String> headers = new HashMap();
	
	/**
	 * 实例化HttpRequest使用的构造方法，需要将对应的客户端的Socket传入，以便读取该客户端发送过来的请求内容
	 * @param socket
	 */
	public HttpRequest(Socket socket){
		this.socket = socket;
		//1.解析请求行
		parseRequestLine();
		//2.解析消息头
		parseHeaders();
		//3.解析消息正文
		parseContent();
		//this socket = socket;
		
		
	}
	/**
	 * 解析请求行  不需要被外界调用就用private
	 */
	private void parseRequestLine(){
		System.out.println("解析请求行");
		System.out.println("请求行解析完毕");
	}
	/**
	 * 解析消息头  不需要被外界调用就用private
	 */
	private void parseHeaders(){
		System.out.println("解析消息头");
	}
	/**
	 * 解析消息正文  不需要被外界调用就用private
	 */
	private void parseContent(){
		System.out.println("解析消息正文");
	}
}
