package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ���дһ��������
 * 1.����ʵ��Controller�ӿ�
 * 2.�����ڴ�����������Ӷ��������ÿһ����������һ�����͵�����
 * 3.����������Ҫ�󣬷������Ϳ�����ModelAndView��Ҳ������String
 * 4.ʹ��@Controller�����ô����������������й���Ҳ����˵��Spring�����ļ��в������øô�����
 * 5.ʹ��@RequestMapping������ǰ�˿�����DispatcherServlet������·���봦�����ķ����Ķ�Ӧ��ϵ��
 *   (Spring�����ļ���������HandlerMapping��)
 */
@Controller
@RequestMapping("/demo")  //����ʡ�ԡ� ����/demo/hello.do
public class HelloController {
	@RequestMapping("/hello.do")
	public String hello() { //�÷������� /hello.do ����
		System.out.println("hello()");
		return "hello"; //����һ����ͼ�� ��ͼ����.jsp�ļ���һ��
	}
	
	@RequestMapping("/login.do")
	public String login() { //�÷������� /login.do ����
		System.out.println("login()");
		return "login"; //����һ����ͼ�� ��ͼ����.jsp�ļ���һ��
	}
}
