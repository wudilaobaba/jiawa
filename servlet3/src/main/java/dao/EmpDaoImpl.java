package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entity.Emp;

public class EmpDaoImpl implements EmpDao,Serializable {
	/**
	 * 模拟实现查询所有员工
	 */
	public List<Emp> findAll() {
		List<Emp> list = new ArrayList<Emp>();
		Emp e1 = new Emp();
		e1.setEmpno(1);
		e1.setEname("唐僧");
		e1.setJob("领导");
		e1.setSal(9000.0);
		list.add(e1);
		
		Emp e2 = new Emp();
		e2.setEmpno(1);
		e2.setEname("悟空");
		e2.setJob("保镖");
		e2.setSal(4000.0);
		list.add(e2);
		
		Emp e3 = new Emp();
		e3.setEmpno(1);
		e3.setEname("八戒空");
		e3.setJob("保镖");
		e3.setSal(6000.0);
		list.add(e3);
		
		return list;
	}

}
