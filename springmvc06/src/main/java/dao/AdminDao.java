package dao;

import entity.Admin;
/**
 * ³Ö¾Ã²ã½Ó¿Ú
 */
public interface AdminDao {
	Admin findByAdminCode(String code);
}
