package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		res.setContentType("text/html");//������Ϣͷ
		PrintWriter out = res.getWriter();
		out.println("<p>ע��ɹ�</p>");//����ʵ������
		out.close();
	}

}
