package entity;

import java.io.Serializable;
/**
 * ���飺
 * 1.����ʹ�÷�װ���ͣ���Ϊ���Ȼ������Ͷ���null
 * 2.ʹ��java.sql���µ����ڣ���Ϊjdbc֧����������������
 * @author pc
 *
 */
public class Emp implements Serializable{//ʵ�����л��ӿ�
	private Integer empno;
	private String ename;
	private String job;
	private Double sal;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getName() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
}
