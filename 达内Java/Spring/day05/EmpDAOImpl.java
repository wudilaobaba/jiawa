package com.whj.project.dao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.whj.project.entity.Emp;

@Repository("empDAO")
public class EmpDAOImpl implements Serializable, EmpDAO {
	@Resource(name="jt")
	private JdbcTemplate template;
	/**
	 * 查出列表
	 */
	public List<Emp> findAll() {
		List<Emp> list = new ArrayList<Emp>();
		String sql = "select * from emp";
		list = template.query(sql, new EmpRowMapper());
		return list;
	}

	/**
	 * 查出一个对象,一般使用该方法
	 */
	public Emp findById(int id) {
		Emp emp = null;
		List<Emp> list = new ArrayList<Emp>();
		String sql = "select * from emp where id=?";
		Object[] args = new Object[] {id}; //对应的参数值
		list = template.query(sql,args, new EmpRowMapper());//此处三个参数！！！
		if(list!=null && list.size()>0) {
			emp =  list.get(0);
		}
		return emp;
	}

	/**
	 * 查出一个对象,一般使用第一种findById方法
	 */
//	public Emp findById2(int id) {
//		Emp emp = null;
//		String sql = "select * from emp where id=?";
//		Object[] args = new Object[] {id}; //对应的参数值
//		try {
//			//id找不到有可能会抛出异常
//			emp = template.queryForObject(sql, args, new EmpRowMapper());
//		}catch(Exception e) {
//			emp = null;
//			e.printStackTrace();
//		}
//		return emp;
//	}

	/**
	 * 增
	 * update 增-删-改都使用update
	 */
	public void save(Emp e) {
		template.update(
				"insert into emp values(null,?,?)",
				new Object[] {e.getName(),e.getAge()}//对应的参数值
		);
	}

	/**
	 * 查询时候使用以下类：
	 * 告诉模板对象JdbcTemplate如何将ResultSet中的一条记录转换为对应的实体对象Entity
	 */
	class EmpRowMapper implements RowMapper<Emp>{//org.xxx的包
		/**
		 * @param rs 要处理的结果集
		 * @param index 当前正在处理的记录的下标，从0开始
		 */
		public Emp mapRow(ResultSet rs, int index) throws SQLException {
			Emp emp = new Emp();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAge(rs.getInt("age"));
			return emp;
		}

	}

	/**
	 * 改：先通过id查询出来，然后在进行修改
	 * 返回值为boolean,方便告知controller层是否修改成功
	 */
	public boolean modify(Emp emp) {
		Emp e = findById(emp.getId());
		if(e == null) {
			return false;
		}
		String sql = "update emp set name=?,age=? where id=?";
		Object[] args = new Object[] {e.getName(),e.getAge(),e.getId()}; //对应的参数值
		template.update(sql,args);
		return true;
	}

	/**
	 * 删：先通过id查询出来，然后在进行删除
	 */
	public boolean deleteById(int id) {
		Emp e = findById(id);
		if(e == null) {
			return false;
		}
		String sql = "delete from emp where id=?";
		Object[] args = new Object[] {e.getId()}; //对应的参数值
		template.update(sql,args);
		return true;
	}
}
