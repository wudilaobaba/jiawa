package com.whj.project.entity;

import java.io.Serializable;

public class Emp2 implements Serializable {
	private String eName;
	private int age;
	private int empNo;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "Emp2 [eName=" + eName + ", age=" + age + ", empNo=" + empNo + "]";
	}
	
}	
