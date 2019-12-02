package com.whj.project.dao;

import java.util.List;
import java.util.Map;

import com.whj.project.entity.Emp;
import com.whj.project.entity.Emp2;

/**
 * Mapper”≥…‰∆˜
 */
public interface EmpDAO {
	void save(Emp emp);
	List<Emp> findAll();
	Emp findById(int id);
	void modify(Emp emp);
	void delete(int id);
	Map findById2(int id);
	Emp2 findById3(int id);
}
