package test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import entity.Emp;
import entity.Emp2;

public class TestCase {
	private SqlSession session;
	
	@Before
	public void init() {
		//以下三行获取SqlSession对象
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		session = ssf.openSession();
	}
	@Test
	public void test01() { //增
		/**
		 * @param 1 映射文件的命名空间.id
		 * @param 2 实体类
		 */
		Emp emp = new Emp();
		emp.setId(903);
		emp.setAge(3);
		emp.setName("大2");
		session.insert("test.save",emp);  //多个映射文件的命名空间名字不同
		session.commit();
		session.close();
	}

	@Test
	public void test02() { //查：所有
		List<Emp> list = session.selectList("test.findAll");
		System.out.println(list);
		session.close();
	}
	
	@Test
	public void test03() { //查：根据id进行查询
		Emp emp = session.selectOne("test.findById",35);
		System.out.println(emp);
		session.close();
	}
	
	@Test
	public void test06() { //查：根据id进行查询,并返回Map
		Map data = session.selectOne("test.findById2",3);
		System.out.println(data);
		System.out.println(data.get("name"));//字段名注意大小写
		session.close();
	}
	
	@Test
	public void test04() { //改
		Emp emp = session.selectOne("test.findById",42);//修改之前先查找
		if(emp!=null) {
			System.out.println(emp);
			emp.setAge(33);
			emp.setName("花湖1");
			session.update("test.modify",emp);
			session.commit();
			session.close();
		}
		
	}
	
	@Test
	public void test05() { //删
		session.delete("test.delete",42);
		session.commit();
		session.close();
	}
	
	@Test
	public void test08() { //使用resultMap解决实体类与表字段名不一致的情况
		Emp2 emp2 = session.selectOne("test.findById3",3);
		System.out.println(emp2);
		session.close();
	}
}
