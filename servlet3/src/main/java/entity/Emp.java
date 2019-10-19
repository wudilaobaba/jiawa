package entity;

import java.io.Serializable;
/**
 * 建议：
 * 1.尽量使用封装类型，因为他比基本类型多了null
 * 2.使用java.sql包下的日期，因为jdbc支持这样的日期类型
 * @author pc
 *
 */
public class Emp implements Serializable{//实现序列化接口
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
