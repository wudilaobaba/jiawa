package whjTest;

import java.io.Serializable;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Emp;

public class Whj implements Serializable {
	public static void main(String[] args) {
		//以下三行获取SqlSession对象
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(Whj.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		SqlSession session = ssf.openSession();


		/**
		 * @param 1 映射文件的命名空间.id
		 * @param 2 实体类
		 */
		Emp emp = new Emp();
		emp.setAge(33);
		emp.setName("大林");
		session.insert("test.save",emp);
		session.commit();
		session.close();
	}
}
