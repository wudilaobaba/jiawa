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
//���·�����֧��get�Լ����ύ
	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String xxx(Emp emp,HttpServletRequest req, HttpServletResponse res) {
		//ҳ���ϵĲ����ֶ�����Admin�Ĳ����ֶ���Ҫ����һ��
		Map map = new HashMap();
		Emp e = service.checkLogin(emp.getName(), emp.getAge());
		map.put("data", e);
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
		}else if(ex instanceof WhjException){
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
