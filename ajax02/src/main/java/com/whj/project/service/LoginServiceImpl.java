package com.whj.project.service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whj.project.dao.EmpDAO;
import com.whj.project.entity.Emp;
@Service("service")
public class LoginServiceImpl implements Serializable, LoginService {
	@Resource(name="xxx")
	private EmpDAO dao;
	public Emp checkLogin(String name,int age) {
		Emp emp = null;
		emp = dao.findByName(name);
		if(emp==null) {
			throw new WhjException("�û�������");
		}
		if(emp.getAge()!=age) {
			throw new WhjException("���䲻ƥ��");
		}
		return emp;
	}

}
