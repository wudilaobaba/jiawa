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
 * 用于Session验证的拦截器
 * @author pc
 *
 */
public class SessionInterceptor implements HandlerInterceptor {
	/**
	 * 收到请求之后，会先执行该方法, 一旦该方法返回false,那么其他程序都不会再继续执行
	 * 若返回true,请求继续向后调用
	 * 若返回false,则不再向后调用
	 * @param handler 描述处理器方法的一个对象
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("admin");
		if(obj == null) {
			//没有登陆，重定向到登陆页面
			List<String> list = new ArrayList();
			list.add("@@@@");
			list.add("@22@");
			map.put("msg", "没有登陆！");
			map.put("lisy", list);
//			Json.returnJson(res,map);
			return true;
		}
		//已经登陆过
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
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion()");
	}

}
