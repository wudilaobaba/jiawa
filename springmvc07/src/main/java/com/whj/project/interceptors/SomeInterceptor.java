package com.whj.project.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SomeInterceptor implements HandlerInterceptor {
	/**
	 * 收到请求之后，会先执行该方法：
	 * 若返回true,请求继续向后调用
	 * 若返回false,则不再向后调用
	 * @param handler 描述处理器方法的一个对象
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		System.out.println("preHandle()");
		return true;
	}

	/**
	 * controller的方法执行完毕后，正准备将处理结果ModelAndView对象返回给前端控制器之前执行该方法
	 * 可以在该方法中修改处理结果
	 * @param modelAndView 用来修改视图部分
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle()");
	}
	
	/**
	 * 最后执行的方法
	 * 注意：只有当preHandle方法返回值为true时，该方法才会执行
	 * @param e 在拦截器中处理外面处理器的异常，可以一个拦截器来处理处理器抛出的异常
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e)
			throws Exception {
		System.out.println("afterCompletion()");
	}

}
