package come.tedu.webserver.servlet;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

import come.tedu.webserver.http.HttpRequest;
import come.tedu.webserver.http.HttpResponse;

public class LoginServlet extends HttpServlet{
	public void service(HttpRequest request,HttpResponse response){
		try{
			System.out.println("开始处理登录业务");
			String userName = request.getParamter("userName");
			String psw = request.getParamter("psw");
			RandomAccessFile raf = new RandomAccessFile("./user.dat", "r");
			byte[] b = new byte[32];
			boolean loginSuccess = false;
			for (int i = 0; i < raf.length() / 100; i++) {
				raf.seek(i * 100);
				raf.read(b);
				String name = new String(b, "utf-8").trim();
				raf.read(b);
				String password = new String(b, "utf-8").trim();
				if (userName.equals(name) && psw.equals(password)) {
					loginSuccess = true;
					break;
				}
			}
			if(loginSuccess){
				forward("./webapps/myweb/success.html",request,response);
			}else{
				forward("./webapps/myweb/fail.html",request,response);
			}
			raf.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
