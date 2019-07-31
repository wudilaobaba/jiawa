package come.tedu.webserver.http;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 该类定义了HTTP协议相关信息
 * @author Administrator
 *
 */
public class HttpContext {
	/*
	 *状态码与对应状态描述的映射关系
	 *key: 状态代码
	 *value: 状态描述
	 */
	private static Map<Integer,String> STATUS_REASON_MAPPING = new HashMap<Integer, String>();
	
	/*
	 * 资源后缀与Content-Type之间的映射关系
	 * key:资源的后缀名
	 * value:该资源对应的Content-Type的值
	 * 注：不同的资源对应的Content-Type的值在w3c上都有定义，可前往w3c官网查询MIME定义
	 */
	private static Map<String,String> MIME_MAPPING = new HashMap<String, String>();
	static{
		initStatusReasonMapping();
		initMimeMapping();
	}
	/**
	 * 初始化后缀资源与Content-Type的映射map
	 */
	private static void initMimeMapping(){
		/*
		 * 读取conf/web.xml文件，将根元素下所有的名为mime-mapping的子元素读取出来，然后将每个mime-mapping元素中的子元素extension
		 * 中间的文本作为key,姜子元素mime-type中间的文本作为value,存入到MIME_MAPPING中，完成初始化。
		 */
		try {
			FileInputStream fis = new FileInputStream("./conf/web.xml");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(fis);
			fis.close();
			Element root = doc.getRootElement();
			List<Element> list = root.elements("mime-mapping");
			for(Element e:list){
				MIME_MAPPING.put(e.elementText("extension"),e.elementText("mime-type"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 初始化状态代码与描述的映射MAP
	 */
	private static void initStatusReasonMapping(){
		STATUS_REASON_MAPPING.put(200,"OK");
		STATUS_REASON_MAPPING.put(302,"Move Them");
		STATUS_REASON_MAPPING.put(404,"404-bad");
		STATUS_REASON_MAPPING.put(500,"500-bad");
	}
	
	/**
	 * 根据资源后缀获取对应的Content-Type值
	 */
	public static String getMime(String ext){
		return MIME_MAPPING.get(ext);
	}
	
	/**
	 * 根据状态码获取对应的状态描述
	 */
	public static String getStatusReason(int statusCode){
		return STATUS_REASON_MAPPING.get(statusCode);
	}
	
	
	
}
