package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 如何写一个处理器
 * 1.不用实现Controller接口
 * 2.可以在处理器当中添加多个方法，每一个方法处理一种类型的请求
 * 3.方法名不做要求，返回类型可以是ModelAndView，也可以是String
 * 4.使用@Controller，将该处理器纳入容器进行管理，也就是说在Spring配置文件中不用配置该处理器
 * 5.使用@RequestMapping，告诉前端控制器DispatcherServlet，请求路径与处理器的方法的对应关系。
 *   (Spring配置文件不用配置HandlerMapping了)
 */
@Controller
@RequestMapping("/demo")  //可以省略。 访问/demo/hello.do
public class HelloController {
	@RequestMapping("/hello.do")
	public String hello() { //该方法处理 /hello.do 请求
		System.out.println("hello()");
		return "hello"; //返回一个视图名 视图名与.jsp文件名一致
	}
	
	@RequestMapping("/login.do")
	public String login() { //该方法处理 /login.do 请求
		System.out.println("login()");
		return "login"; //返回一个视图名 视图名与.jsp文件名一致
	}
}
