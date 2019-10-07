package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1.使用req获取请求数据
		//1)请求行
		System.out.println("--------------请求行-------------");
		System.out.println("请求方式："+req.getMethod());
		System.out.println("访问路径："+req.getServletPath());
		System.out.println("协议类型："+req.getProtocol());
		//2)消息头(键值对)
		System.out.println("--------------消息头-------------");
		//Enumeration是老版本的迭代器，作用和Iterator类似
		Enumeration<String> e = req.getHeaderNames();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			String value = req.getHeader(key);
			System.out.println(key+":"+value);
		}
		//3)实体内容
		//本案例没有传递具体的业务数据，所以实体内容为空，以后再演示
		System.out.println("-------------实体内容------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		//2.使用res发送响应数据
		//1)状态行
		//状态行数据由服务器自动填充，开发者不用管
		//2)消息头
		//开发者要设置Content-Type，其余消息头中的大部分数据由服务器自动填充，如res.setContentType("text/html");
		//声明服务器向浏览器发送的内容的类型
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		//3)实体内容，
		//我们输出的网页就是实体内容
		//此处偷懒了，省略了网页基本的结构，以后会有改进的方案
		out.println("<p>"+now+"</p>");
		out.close();
		
		
		/*
		 * req获取单个值 req.getParameter("");//账号，密码，性别
		 * req获取多个值 req.getParameterValues("");//兴趣
		 * */
	}

}
