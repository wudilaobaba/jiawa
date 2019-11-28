package service;

import entity.Admin;

/**
 * 业务层接口
 */
public interface LoginService {
	Admin checkLogin(String username,String passward);
}
