package come.tedu.webserver.servlet;

import java.io.File;

import come.tedu.webserver.http.HttpRequest;
import come.tedu.webserver.http.HttpResponse;

/**
 * 所有Servlet的超类，规定了Servlet的功能
 * @author Administrator
 *
 */
public abstract class HttpServlet {
	public abstract void service(HttpRequest request,HttpResponse response);
	/**
	 * 实现方法：调转到指定路径
	 * 在TOMCAT中实际上是定义在转发器上的功能
	 * TOMCAT以链式的结构将各组件之间串联在一起，进行跳转调用
	 * @param url
	 * @param request
	 * @param response
	 */
	public void forward(String url,HttpRequest request,HttpResponse response){
		response.setStatusCode(200);
		response.setEntity(new File(url));
	}
}
