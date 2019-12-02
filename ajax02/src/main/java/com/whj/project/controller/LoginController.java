package com.whj.project.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whj.project.entity.Emp;
import com.whj.project.service.LoginService;
import com.whj.project.service.WhjException;
import com.whj.project.util.Json;

@Controller
public class LoginController implements Serializable{
	@Resource(name="service")
	private LoginService service;
//以下方法仅支持get以及表单提交
	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String xxx(Emp emp,HttpServletRequest req, HttpServletResponse res) {
		//页面上的参数字段名与Admin的参数字段名要保持一致
		Map map = new HashMap();
		Emp e = service.checkLogin(emp.getName(), emp.getAge());
		map.put("data", e);
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
		}else if(ex instanceof WhjException){
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
