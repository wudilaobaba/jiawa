package com.whj.project.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whj.project.dao.EmpDAO;
import com.whj.project.entity.Emp;
@Service("service")
public class LoginServiceImpl implements Serializable, LoginService {
	@Resource(name="empDAO")
	private EmpDAO empDAO;
	public List<Emp> find() {
		List<Emp> list = empDAO.findAll();
		return list;
	}
	
	public void addEmp(String name, int age) {
		Emp e = new Emp();
		e.setAge(age);
		e.setName(name);
		empDAO.save(e);
	}
	
	public Emp findById(int id) {
		Emp e = empDAO.findById(id);
		return e;
	}
	
	public boolean modify(Emp emp) {
		return empDAO.modify(emp);
	}

	public boolean deleteById(int id) {
		return empDAO.deleteById(id);
	}
}
