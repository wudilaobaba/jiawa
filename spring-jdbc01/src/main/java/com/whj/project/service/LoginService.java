package com.whj.project.service;

import java.util.List;

import com.whj.project.entity.Emp;

public interface LoginService {
	List<Emp> find();
	void addEmp(String name,int age);
	Emp findById(int id);
	boolean modify(Emp emp);
	boolean deleteById(int id);
}
