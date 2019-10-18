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
		//���������һ�㲽���ǣ�
		//1.���ղ���
		String user = req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] insterests = req.getParameterValues("interest");
		//2.����ҵ��
		//�����ע��ҵ��Ӧ�ñ�����Щ���ݣ����������ص����ڴ��Σ���˾Ͳ�����
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		if(insterests!=null) {
			for(String i:insterests) {
				System.out.println(i);
			}
		}
		//3.������Ӧ
		//�������
		System.out.println(req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
		res.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, OPTIONS");
		res.setHeader("Access-Control-Allow-Credentials", "true");


		res.setContentType("application/json");//������Ϣͷ
		PrintWriter out = res.getWriter();
		Map<String,String> json =new HashMap();
		json.put("result"," success");
		json.put("code"," 200");
		JSONObject jsonObject = JSONObject.fromObject(json);
		String result = jsonObject.toString();




		out.println(result);//����ʵ������
		out.close();
	}

}
