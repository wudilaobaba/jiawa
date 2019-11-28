package interceptors;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import util.Json;
/**
 * ����Session��֤��������
 * @author pc
 *
 */
public class SessionInterceptor implements HandlerInterceptor {
	/**
	 * �յ�����֮�󣬻���ִ�и÷���, һ���÷�������false,��ô�������򶼲����ټ���ִ��
	 * ������true,�������������
	 * ������false,����������
	 * @param handler ����������������һ������
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("admin");
		if(obj == null) {
			//û�е�½���ض��򵽵�½ҳ��
			List<String> list = new ArrayList();
			list.add("@@@@");
			list.add("@22@");
			map.put("msg", "û�е�½��");
			map.put("lisy", list);
//			Json.returnJson(res,map);
			return true;
		}
		//�Ѿ���½��
		return true;
	}

	
	
	/**
	 * controller�ķ���ִ����Ϻ���׼����������ModelAndView���󷵻ظ�ǰ�˿�����֮ǰִ�и÷���
	 * �����ڸ÷������޸Ĵ�����
	 * @param modelAndView �����޸���ͼ����
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle()");
	}

	/**
	 * ���ִ�еķ���
	 * ע�⣺ֻ�е�preHandle��������ֵΪtrueʱ���÷����Ż�ִ��
	 * @param e ���������д������洦�������쳣������һ�������������������׳����쳣
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion()");
	}

}
