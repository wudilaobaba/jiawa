package service;

import entity.Admin;

/**
 * ҵ���ӿ�
 */
public interface LoginService {
	Admin checkLogin(String username,String passward);
}
