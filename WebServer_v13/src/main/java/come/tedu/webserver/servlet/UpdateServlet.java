package come.tedu.webserver.servlet;

import come.tedu.webserver.http.HttpRequest;
import come.tedu.webserver.http.HttpResponse;

public class UpdateServlet extends HttpServlet{
	public void service(HttpRequest request,HttpResponse response){
		System.out.println("来了老弟！！！");
	}
}
