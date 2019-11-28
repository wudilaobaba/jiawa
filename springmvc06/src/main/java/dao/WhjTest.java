package dao;

import java.io.Serializable;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Admin;
import service.LoginService;
public class WhjTest implements Serializable {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc.xml");
		LoginService l = ac.getBean("loginService",LoginService.class);
		Admin admin = l.checkLogin("Îò¾»","789");
		System.out.println(admin);
	}
}
