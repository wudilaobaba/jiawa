package controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Admin;
import service.ApplicationException;
import service.LoginService;
import util.Json;

@Controller
public class LoginController {
	@Resource(name="loginService")
	private LoginService service;
	//  返回json    http://localhost:8080/springmvc06/login.do?username=22&age=12&psw=111
	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String xxx(Admin admin,HttpServletRequest req, HttpServletResponse res,HttpSession session) {
		//页面上的参数字段名与Admin的参数字段名要保持一致
		//调用业务层服务
		Map map = new HashMap();
//		Integer.parseInt("aa");  //测试触发下方异常处理，若有异常，则自动调用以下异常处理方法
		//自动处理异常
		Admin a = service.checkLogin(admin.getUsername(), admin.getPsw());
		map.put("username", a.getUsername());
		map.put("psw", a.getPsw());
		return Json.result(req, res, map);
	}
	
	/**
	 * 异常处理方法
	 * @param ex 其他@RequestMapping注解方法抛出的异常,会被该方法检测到，并根据不同的错误类型进行处理
	 * @return 视图名，会自动跳转到 --->"视图名.jsp"  如果想要以.jsp的形式进行返回，那么就return一个与.jsp文件名一致的视图名字符串
	 */
	@ExceptionHandler
	public String sss(Exception ex,HttpServletRequest req,HttpServletResponse res) {
		Map<String,Object> map = new HashMap<String,Object>();
		//依据异常类型的不同，分别进行相应的处理
		if(ex instanceof NumberFormatException) {
			map.put("msg", "数字格式错误");
			Json.returnJson(req,res, map);
//			return "error";
		}else if(ex instanceof ArrayIndexOutOfBoundsException) {
			map.put("msg", "下标越界");
			Json.returnJson(req,res, map);
//			return "error";
		}else if(ex instanceof ApplicationException){
			map.put("code", 0);
			map.put("msg", ex.getMessage());
			Json.returnJson(req,res, map);
		}else {
			//其他系统异常的处理
			map.put("msg", "系统异常");
			Json.returnJson(req,res, map);
//			return "system_error";
		}
		return null;
	}
	
	
}
