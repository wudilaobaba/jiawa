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
		//处理请求乱码：第三种方法，只对post有效
		req.setCharacterEncoding("utf-8");
		//处理请求的一般步骤是：
		//1.接收参数  重点： ***接受参数的方法getParameter只能是get请求或者post请求的表单提交才能使用该方法*****
		System.out.println(req.getMethod());
		String user = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] insterests = req.getParameterValues("interest");
		//处理请求乱码：第一种方法 get/post都有效，一般不用此方法！！！
//		byte[] bs = user.getBytes("ISO8859-1");
//		user = new String(bs,"utf-8");
		
		
		//2.处理业务
		//常规的注册业务应该保存这些数据，但本案例重点在于传参，因此就不存了
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		System.out.println(insterests);
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

		res.setContentType("application/json;charset=utf-8");//设置消息头
		PrintWriter out = res.getWriter();
		Map<String,String> json =new HashMap();
		json.put("result","成功");
		json.put("code","200");
		JSONObject jsonObject = JSONObject.fromObject(json);
		String result = jsonObject.toString();



		out.println(result);//设置实体内容
		out.close();
	}

}
