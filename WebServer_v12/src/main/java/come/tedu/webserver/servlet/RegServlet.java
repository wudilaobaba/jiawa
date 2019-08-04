package come.tedu.webserver.servlet;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

import come.tedu.webserver.http.HttpRequest;
import come.tedu.webserver.http.HttpResponse;

/**
 * 处理注册业务
 * @author Administrator
 *
 */
public class RegServlet extends HttpServlet{
	public void service(HttpRequest request,HttpResponse response){
		try{
			System.out.println("开始处理注册业务");
			/*
			 * 注册业务流程 1.通过reqest获取用户在注册页面上输入的注册信息
			 * 2.使用RandomAccessFile打开use.dat文件 3.将该用户信息写入文件
			 * 4.设置response,响应注册成功页面
			 */
			String userName = request.getParamter("userName");
			String psw = request.getParamter("psw");
			String nickName = request.getParamter("nickName");
			int age = Integer.parseInt(request.getParamter("age"));
			// 对用户数据进行必要验证
			RandomAccessFile raf = new RandomAccessFile("./user.dat", "rw");
			raf.seek(raf.length());
			raf.write(Arrays.copyOf(userName.getBytes("utf-8"), 32));
			raf.write(Arrays.copyOf(psw.getBytes("utf-8"), 32));
			raf.write(Arrays.copyOf(nickName.getBytes("utf-8"), 32));
			raf.writeInt(age);
			raf.close();
			forward("./webapps/myweb/success.html",request,response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
