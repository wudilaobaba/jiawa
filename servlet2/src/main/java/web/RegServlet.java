package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

public class RegServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//处理请求的一般步骤是：
		//1.接收参数
		String user = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] insterests = req.getParameterValues("interest");
		//2.处理业务
		//常规的注册业务应该保存这些数据，但本案例重点在于传参，因此就不存了
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		if(insterests!=null) {
			for(String i:insterests) {
				System.out.println(i);
			}
		}
		//3.发送响应
		//允许跨域
		System.out.println(req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
		res.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, OPTIONS");
		res.setHeader("Access-Control-Allow-Credentials", "true");


		res.setContentType("application/json");//设置消息头
		PrintWriter out = res.getWriter();
		Map<String,String> json =new HashMap();
		json.put("result"," success");
		json.put("code"," 200");
		JSONObject jsonObject = JSONObject.fromObject(json);
		String result = jsonObject.toString();




		out.println(result);//设置实体内容
		out.close();
	}

}
