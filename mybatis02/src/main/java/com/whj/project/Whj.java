package com.whj.project;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.whj.project.dao.EmpDAO;
import com.whj.project.entity.Emp;

public class Whj {
	public static void main(String[] args) {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(Whj.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		SqlSession session = ssf.openSession();
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = new Emp();
		emp.setName("¥Û…Ò2");
		emp.setAge(66);
		dao.save(emp);
		session.commit();
		session.close();
	}
}
