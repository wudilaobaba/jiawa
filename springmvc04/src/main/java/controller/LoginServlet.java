package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginServlet {
	//	@RequestMapping("/login.do")
	//  读取请求参数值的第1种方式  通过request对象
	//	public String xxx(HttpServletRequest req) {
	//		String username = req.getParameter("username");
	//		System.out.println(username);
	//		return "login";
	//	}
	//  http://localhost:8080/springmvc04/login.do?username=22

	//  读取请求参数值的第2种方式  使用注解 - @RequestParam	
	//	@RequestMapping("/login.do")
	//	public String xxx(@RequestParam("username") String name) {
	//		System.out.println(name);
	//		return "login";
	//	}

	//  读取请求参数值的第3种方式  使用javabean封装请求参数值 看AdminParam.java
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap) {
	//		System.out.println(ap.getAge());
	//		System.out.println(ap.getPsw());
	//		System.out.println(ap.getUsername());
	//		return "login";
	//	}

	//	向页面传值的第1种方式，了解吧，一般都是直接返回json了
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap, HttpServletRequest req) {
	//		String username = ap.getUsername();
	//		//将数据绑定到req
	//		req.setAttribute("username", username);
	//		//springmvc默认使用转发
	//		return "login";
	//	}

	//	向页面传值的第2种方式，使用ModelAndView对象
	//	@RequestMapping("/login.do")
	//	public ModelAndView xxx(AdminParam ap) {
	//		String username = ap.getUsername();
	//		//构造ModelAndView对象
	//		Map<String,Object> data = new HashMap();
	//		data.put("username", ap.getUsername()); //相当于req.setAttribute("username", username);
	//		ModelAndView mav = new ModelAndView("login",data);
	//		return mav;
	//	}

	//  向页面传值的第3种方式，使用ModelMap对象
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap, ModelMap mm) {
	//		String username = ap.getUsername();
	//		mm.addAttribute("username",username);//相当于req.setAttribute("username", username);
	//		return "login";
	//	}

	//  向页面传值的第4种方式，使用Session
	//	@RequestMapping("/login.do")
	//	public String xxx(AdminParam ap, HttpSession session) {
	//		String username = ap.getUsername();
	//		session.setAttribute("username",username);
	//		return "login";
	//	}

	//  页面重定向1. 访问 http://localhost:8080/springmvc04/login.do
	//	@RequestMapping("/login.do")
	//	public String xxx() {
	//		return "redirect:toIndex.do";
	//	}
	@RequestMapping("/toIndex.do")
	public String yyy() {
		return "index";
	}
	//  页面重定向2. 访问 http://localhost:8080/springmvc04/login.do
	@RequestMapping("/login.do")
	public ModelAndView xxx() {
		RedirectView rv = new RedirectView("toIndex.do");
		return new ModelAndView(rv);
	}

	//  返回json    http://localhost:8080/springmvc04/login.do?username=22&age=12&psw=111
	//	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	//	public @ResponseBody String xxx(AdminParam ap,HttpServletRequest req, HttpServletResponse res) {
	//		//以下四行允许跨于：
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
