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
	 * ����б�
	 */
	public List<Emp> findAll() {
		List<Emp> list = new ArrayList<Emp>();
		String sql = "select * from emp";
		list = template.query(sql, new EmpRowMapper());
		return list;
	}
	
	/**
	 * ���һ������,һ��ʹ�ø÷���
	 */
	public Emp findById(int id) {
		Emp emp = null;
		List<Emp> list = new ArrayList<Emp>();
		String sql = "select * from emp where id=?";
		Object[] args = new Object[] {id}; //��Ӧ�Ĳ���ֵ
		list = template.query(sql,args, new EmpRowMapper());//�˴���������������
		if(list!=null && list.size()>0) {
			emp =  list.get(0);
		}
		return emp;
	}
	
	/**
	 * ���һ������,һ��ʹ�õ�һ��findById����
	 */
//	public Emp findById2(int id) {
//		Emp emp = null;
//		String sql = "select * from emp where id=?";
//		Object[] args = new Object[] {id}; //��Ӧ�Ĳ���ֵ
//		try {
//			//id�Ҳ����п��ܻ��׳��쳣
//			emp = template.queryForObject(sql, args, new EmpRowMapper());
//		}catch(Exception e) {
//			emp = null;
//			e.printStackTrace();
//		}
//		return emp;
//	}
	
	/**
	 * ��
	 * update ��-ɾ-�Ķ�ʹ��update
	 */
	public void save(Emp e) {
		template.update(
				"insert into emp values(null,?,?)",
				new Object[] {e.getName(),e.getAge()}//��Ӧ�Ĳ���ֵ
		);
	}
	
	/**
	 * ��ѯʱ��ʹ�������ࣺ
	 * ����ģ�����JdbcTemplate��ν�ResultSet�е�һ����¼ת��Ϊ��Ӧ��ʵ�����Entity
	 */
	class EmpRowMapper implements RowMapper<Emp>{//org.xxx�İ�
		/**
		 * @param rs Ҫ����Ľ����
		 * @param index ��ǰ���ڴ���ļ�¼���±꣬��0��ʼ
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
	 * �ģ���ͨ��id��ѯ������Ȼ���ڽ����޸�
	 * ����ֵΪboolean,�����֪controller���Ƿ��޸ĳɹ�
	 */
	public boolean modify(Emp emp) {
		Emp e = findById(emp.getId());
		if(e == null) {
			return false;
		}
		String sql = "update emp set name=?,age=? where id=?";
		Object[] args = new Object[] {e.getName(),e.getAge(),e.getId()}; //��Ӧ�Ĳ���ֵ
		template.update(sql,args);
		return true;
	}
	
	/**
	 * ɾ����ͨ��id��ѯ������Ȼ���ڽ���ɾ��
	 */
	public boolean deleteById(int id) {
		Emp e = findById(id);
		if(e == null) {
			return false;
		}
		String sql = "delete from emp where id=?";
		Object[] args = new Object[] {e.getId()}; //��Ӧ�Ĳ���ֵ
		template.update(sql,args);
		return true;
	}
}
