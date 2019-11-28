package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class CheckServlet {
	//  返回json    http://localhost:8080/springmvc04/login.do?username=22&age=12&psw=111
	@RequestMapping(value = "/bmi.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String xxx(Bmi bmi,HttpServletRequest req, HttpServletResponse res) {
		//以下四行允许跨于：
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors");
		res.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, OPTIONS");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		
		double height = bmi.getHeight();
		double weight = bmi.getWeight();
		double result = weight/height/height;
		String msg = "";
		if(result>25) {
			msg  = "过重";
		}else if(result<19) {
			msg  = "过轻";
		}else {
			msg  = "正常";
		}
		Map map = new HashMap();
		map.put("result", msg);
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
