package entity;


public class Admin{
	private String username;
	private String psw;
	private int code;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Admin [username=" + username + ", psw=" + psw + ", code=" + code + "]";
	}
	
}
