package com.whj.project.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SomeInterceptor implements HandlerInterceptor {
	/**
	 * �յ�����֮�󣬻���ִ�и÷�����
	 * ������true,�������������
	 * ������false,����������
	 * @param handler ����������������һ������
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		System.out.println("preHandle()");
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
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e)
			throws Exception {
		System.out.println("afterCompletion()");
	}

}
