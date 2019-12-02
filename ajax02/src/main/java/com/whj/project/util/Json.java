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
 * ǰ����뷵��JSON���ݸ�ǰ�ˣ����ú�Map���ݺ󣬵��� return Json.result(req, res, map); ����
 * ��������������ֻҪ��һ���������ˣ���ôǰ�˾ͻ�ֱ�ӷ������������������ٵ���Ҳ���᷵����
 * @author pc
 *
 */
public class Json implements Serializable {
	/**
	 * ֻ������controller��ĵ���
	 * @param req
	 * @param res
	 * @param map
	 * @return
	 */
	public static String result(HttpServletRequest req, HttpServletResponse res, Map map){
		//�������
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
	 * ���ڷ�controller��ĸ�ǰ�˷���json�ķ���
	 * ���ã�Json.returnJson(res,map); ֱ�ӵ��ü��ɷ���JSON��ǰ��
	 * @param response
	 * @param map
	 * @throws Exception
	 */
	public static void returnJson(HttpServletRequest req, HttpServletResponse res, Map<String, Object> map){
		//�������
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
