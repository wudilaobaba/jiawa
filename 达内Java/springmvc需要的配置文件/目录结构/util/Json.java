package com.whj.project.util;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.json.JSONObject;
/**
 * 前后分离返回JSON数据给前端，设置好Map数据后，调用 return Json.result(req, res, map); 即可
 * 以下两个方法，只要有一个被调用了，那么前端就会直接返回这个，后面程序中再调用也不会返回了
 * @author pc
 *
 */
public class Json implements Serializable {
	/**
	 * 只可用于controller层的调用
	 * @param req
	 * @param res
	 * @param map
	 * @return
	 */
	public static String result(HttpServletRequest req, HttpServletResponse res, Map map){
		//允许跨域
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
		res.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, OPTIONS");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		ObjectMapper mapper = new ObjectMapper();
		String resultString = "";
		try {
			resultString = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return resultString;
	}

	/**
	 * 用于非controller层的给前端返回json的方法
	 * 调用：Json.returnJson(res,map); 直接调用即可返回JSON给前端
	 * @param response
	 * @param map
	 * @throws Exception
	 */
	public static void returnJson(HttpServletRequest req, HttpServletResponse res, Map<String, Object> map){
		//允许跨域
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
		res.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, OPTIONS");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		PrintWriter writer = null;
		res.setContentType("application/json;charset=utf-8");
		JSONObject jsonMap = JSONObject.fromObject(map);
		try {
			writer = res.getWriter();
			writer.print(jsonMap);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
}
