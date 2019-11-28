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
			//�û�������,�׳�һ��Ӧ���쳣���û���������Ĵ���
			throw new ApplicationException("�˺Ų�����"); //�Զ�����쳣,ֻҪ����������������
		}
		if(!admin.getPsw().equals(passward)) {
			//���벻��ȷ �׳�һ��Ӧ���쳣
			throw new ApplicationException("�������"); //�Զ�����쳣,ֻҪ����������������
		}
		return admin;
	}

}
