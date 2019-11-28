package com.whj.project.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whj.project.entity.Admin;
import com.whj.project.util.Json;

@Controller
public class Hello implements Serializable{
	//@Resource(name="loginService")
	//private LoginService service;
	@RequestMapping(value = "/login.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String xxx(Admin admin,HttpServletRequest req, HttpServletResponse res) {
		//ҳ���ϵĲ����ֶ�����Admin�Ĳ����ֶ���Ҫ����һ��
		Map map = new HashMap();
		map.put("name", "age");
		return Json.result(req, res, map);
	}
	
	@RequestMapping(value = "/hello.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String hello(Admin admin,HttpServletRequest req, HttpServletResponse res) {
		//ҳ���ϵĲ����ֶ�����Admin�Ĳ����ֶ���Ҫ����һ��
		Map map = new HashMap();
		map.put("name", "������");
		return Json.result(req, res, map);
	}
}
