package service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.AdminDao;
import entity.Admin;
@Service("loginService")
public class LoginServiceImpl implements LoginService, Serializable {
	private static final long serialVersionUID = 198L;
	@Resource(name="adminDao")
	private AdminDao dao;
	public Admin checkLogin(String username, String passward) {
		Admin admin = dao.findByAdminCode(username);
		if(admin == null) {
			//用户不存在,抛出一个应用异常（用户操作引起的错误）
			throw new ApplicationException("账号不存在"); //自定义的异常,只要构造器中两个方法
		}
		if(!admin.getPsw().equals(passward)) {
			//密码不正确 抛出一个应用异常
			throw new ApplicationException("密码错误"); //自定义的异常,只要构造器中两个方法
		}
		return admin;
	}

}
