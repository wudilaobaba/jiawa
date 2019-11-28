package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginServlet {
	//	@RequestMapping("/login.do")
	//  ��ȡ�������ֵ�ĵ�1�ַ�ʽ  ͨ��request����
	//	public String xxx(HttpServletRequest req) {
	//		String username = req.getParameter("username");
	//		System.out.println(username);
	//		return "login";
	//	}
	//  http://localhost:8080/springmvc04/login.do?username=22

	//  ��ȡ�������ֵ�ĵ�2�ַ�ʽ  ʹ��ע�� - @RequestParam	
	//	@RequestMapping("/login.do")
	//	public String xxx(@RequestParam("username") String name) {
	//		System.out.println(name);
	//		return "login";
	//	}

	//  ��ȡ�������ֵ�ĵ�3�ַ�ʽ  ʹ��javabean��װ�������ֵ ��AdminParam.java
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap) {
	//		System.out.println(ap.getAge());
	//		System.out.println(ap.getPsw());
	//		System.out.println(ap.getUsername());
	//		return "login";
	//	}

	//	��ҳ�洫ֵ�ĵ�1�ַ�ʽ���˽�ɣ�һ�㶼��ֱ�ӷ���json��
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap, HttpServletRequest req) {
	//		String username = ap.getUsername();
	//		//�����ݰ󶨵�req
	//		req.setAttribute("username", username);
	//		//springmvcĬ��ʹ��ת��
	//		return "login";
	//	}

	//	��ҳ�洫ֵ�ĵ�2�ַ�ʽ��ʹ��ModelAndView����
	//	@RequestMapping("/login.do")
	//	public ModelAndView xxx(AdminParam ap) {
	//		String username = ap.getUsername();
	//		//����ModelAndView����
	//		Map<String,Object> data = new HashMap();
	//		data.put("username", ap.getUsername()); //�൱��req.setAttribute("username", username);
	//		ModelAndView mav = new ModelAndView("login",data);
	//		return mav;
	//	}

	//  ��ҳ�洫ֵ�ĵ�3�ַ�ʽ��ʹ��ModelMap����
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap, ModelMap mm) {
	//		String username = ap.getUsername();
	//		mm.addAttribute("username",username);//�൱��req.setAttribute("username", username);
	//		return "login";
	//	}

	//  ��ҳ�洫ֵ�ĵ�4�ַ�ʽ��ʹ��Session
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap, HttpSession session) {
	//		String username = ap.getUsername();
	//		session.setAttribute("username",username);
	//		return "login";
	//	}

	//  ҳ���ض���1. ���� http://localhost:8080/springmvc04/login.do
	//	@RequestMapping("/login.do")
	//	public String xxx() {
	//		return "redirect:toIndex.do";
	//	}
	@RequestMapping("/toIndex.do")
	public String yyy() {
		return "index";
	}
	//  ҳ���ض���2. ���� http://localhost:8080/springmvc04/login.do
	@RequestMapping("/login.do")
	public ModelAndView xxx() {
		RedirectView rv = new RedirectView("toIndex.do");
		return new ModelAndView(rv);
	}

	//  ����json    http://localhost:8080/springmvc04/login.do?username=22&age=12&psw=111
	//	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	//	public @ResponseBody String xxx(AdminParam ap,HttpServletRequest req, HttpServletResponse res) {
	//		//��������������ڣ�
	//		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
	//		res.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
	//		res.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, OPTIONS");
	//		res.setHeader("Access-Control-Allow-Credentials", "true");
	//		Map map = new HashMap();
	//		map.put("username", ap.getUsername());
	//		map.put("age", ap.getAge());
	//		map.put("psw", ap.getPsw());
	//		ObjectMapper mapper = new ObjectMapper();
	//		String resultString = "";
	//		try {
	//			resultString = mapper.writeValueAsString(map);
	//		} catch (JsonProcessingException e) {
	//			e.printStackTrace();
	//		}
	//		return resultString;
	//	}

}
