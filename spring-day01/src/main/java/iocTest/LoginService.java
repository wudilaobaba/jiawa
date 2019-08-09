package iocTest;

public class LoginService {
	private AdminDAO adminDAO;
	public void setDao(AdminDAO adminDAO){
		this.adminDAO = adminDAO;
	}
	public void run(){
		adminDAO.run();
	}
}
