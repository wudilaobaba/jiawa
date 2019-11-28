package com.whj.project.dao;

import java.util.List;

import com.whj.project.entity.Emp;

public interface EmpDAO {
	List<Emp> findAll();
	void save(Emp e);
	Emp findById(int id);
	boolean modify(Emp emp);
	boolean deleteById(int id);
}
