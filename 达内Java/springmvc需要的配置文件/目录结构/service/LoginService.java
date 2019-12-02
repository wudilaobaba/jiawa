package com.whj.project.service;

import com.whj.project.entity.Emp;

public interface LoginService {
	Emp checkLogin(String name,int age);
}
