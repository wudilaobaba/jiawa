package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1.ʹ��req��ȡ��������
		//1)������
		System.out.println("--------------������-------------");
		System.out.println("����ʽ��"+req.getMethod());
		System.out.println("����·����"+req.getServletPath());
		System.out.println("Э�����ͣ�"+req.getProtocol());
		//2)��Ϣͷ(��ֵ��)
		System.out.println("--------------��Ϣͷ-------------");
		//Enumeration���ϰ汾�ĵ����������ú�Iterator����
		Enumeration<String> e = req.getHeaderNames();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			String value = req.getHeader(key);
			System.out.println(key+":"+value);
		}
		//3)ʵ������
		//������û�д��ݾ����ҵ�����ݣ�����ʵ������Ϊ�գ��Ժ�����ʾ
		System.out.println("-------------ʵ������------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		//2.ʹ��res������Ӧ����
		//1)״̬��
		//״̬�������ɷ������Զ���䣬�����߲��ù�
		//2)��Ϣͷ
		//������Ҫ����Content-Type��������Ϣͷ�еĴ󲿷������ɷ������Զ���䣬��res.setContentType("text/html");
		//��������������������͵����ݵ�����
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		//3)ʵ�����ݣ�
		//�����������ҳ����ʵ������
		//�˴�͵���ˣ�ʡ������ҳ�����Ľṹ���Ժ���иĽ��ķ���
		out.println("<p>"+now+"</p>");
		out.close();
		
		
		/*
		 * req��ȡ����ֵ req.getParameter("");//�˺ţ����룬�Ա�
		 * req��ȡ���ֵ req.getParameterValues("");//��Ȥ
		 * */
	}

}
