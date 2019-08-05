package come.tedu.webserver.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 服务环境信息
 * @author Administrator
 *
 */
public class ServerContext {
	/**
	 * 请求与Servlet的映射
	 * key:请求路径
	 * value:对应Servlet的名字
	 */
	private static Map<String,String> servletMapping = new HashMap<String,String>();
	static{
		initServletMapping();
	}
	/**
	 * 初始化请求与Servlet的映射信息
	 */
	private static void initServletMapping(){
		
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new File("./conf/server.xml"));
			Element servlets = doc.getRootElement().element("servlets");
			List<Element> list = servlets.elements();
			for(Element e : list){
				servletMapping.put(e.attributeValue("url"),e.attributeValue("className"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getServletName(String url){
		return servletMapping.get(url);
	}
}
