package entity;

import java.io.Serializable;
/**
 * 使用resultMap解决实体类与表字段名不一致的情况
 * @author pc
 *
 */
public class Emp2 implements Serializable {
	private int empNo;
	private String eName;
	private int age;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
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
	@Override
	public String toString() {
		return "Emp2 [empNo=" + empNo + ", eName=" + eName + ", age=" + age + "]";
	}
}
