package dao;

import entity.Admin;
/**
 * �־ò�ӿ�
 */
public interface AdminDao {
	Admin findByAdminCode(String code);
}
