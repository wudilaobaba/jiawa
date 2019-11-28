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
	//  ����json    http://localhost:8080/springmvc06/login.do?username=22&age=12&psw=111
	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String xxx(Admin admin,HttpServletRequest req, HttpServletResponse res,HttpSession session) {
		//ҳ���ϵĲ����ֶ�����Admin�Ĳ����ֶ���Ҫ����һ��
		//����ҵ������
		Map map = new HashMap();
//		Integer.parseInt("aa");  //���Դ����·��쳣���������쳣�����Զ����������쳣������
		//�Զ������쳣
		Admin a = service.checkLogin(admin.getUsername(), admin.getPsw());
		map.put("username", a.getUsername());
		map.put("psw", a.getPsw());
		return Json.result(req, res, map);
	}
	
	/**
	 * �쳣������
	 * @param ex ����@RequestMappingע�ⷽ���׳����쳣,�ᱻ�÷�����⵽�������ݲ�ͬ�Ĵ������ͽ��д���
	 * @return ��ͼ�������Զ���ת�� --->"��ͼ��.jsp"  �����Ҫ��.jsp����ʽ���з��أ���ô��returnһ����.jsp�ļ���һ�µ���ͼ���ַ���
	 */
	@ExceptionHandler
	public String sss(Exception ex,HttpServletRequest req,HttpServletResponse res) {
		Map<String,Object> map = new HashMap<String,Object>();
		//�����쳣���͵Ĳ�ͬ���ֱ������Ӧ�Ĵ���
		if(ex instanceof NumberFormatException) {
			map.put("msg", "���ָ�ʽ����");
			Json.returnJson(req,res, map);
//			return "error";
		}else if(ex instanceof ArrayIndexOutOfBoundsException) {
			map.put("msg", "�±�Խ��");
			Json.returnJson(req,res, map);
//			return "error";
		}else if(ex instanceof ApplicationException){
			map.put("code", 0);
			map.put("msg", ex.getMessage());
			Json.returnJson(req,res, map);
		}else {
			//����ϵͳ�쳣�Ĵ���
			map.put("msg", "ϵͳ�쳣");
			Json.returnJson(req,res, map);
//			return "system_error";
		}
		return null;
	}
	
	
}
