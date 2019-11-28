package com.whj.project.util;



import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 前后分离返回JSON数据给前端，设置好Map数据后，调用 return Json.result(req, res, map); 即可
 * @author pc
 *
 */
public class Json implements Serializable {
	public static String result(HttpServletRequest req, HttpServletResponse res,Map map){
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
}
