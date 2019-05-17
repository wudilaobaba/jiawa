package testxml;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class Demo01 {

	public static void main(String[] args) throws IOException,DocumentException{
		/*
		 *利用dom4j读取XML文件 
		 */
		FileInputStream fis = new FileInputStream("books.xml");
		SAXReader reader = new SAXReader();
		//如果XML文件格式错误，则抛异常
		Document doc = reader.read(fis);
		fis.close();
		//输出doc
		//System.out.println(doc.asXML());
		Element root = doc.getRootElement();
		//Element类型的对象，就代表xml文件中的一个元素
		//输出root信息，则会输出根元素的全部内容
//		System.out.println(root.asXML());
		
		//查找根元素的第一个子元素
		Element book = root.element("book");//-----01.查找root中第一个满足参数的子元素(适合查找有唯一子元素的情况)
//		System.out.println(book.asXML());
		
		//查找books的全部子元素
		List list = root.elements();//------------02.查找root的全部子元素(不区别名字查找全部子元素)
		list.size();//===========返回list中元素的个数
		//List list = root.elements("book-xxx");//----03.查找元素中名字是参数book的所有子元素(子元素很多，但子元素名字不相同，找出名字相同的一组子元素)
//		System.out.println(list);
		//List是一个集合，相当于一个数组，存储了books的全部子元素(3个book)
		Element e1 = (Element)list.get(0);
		Element e2 = (Element)list.get(1);
		Element e3 = (Element)list.get(2);
		System.out.println(e1.asXML());
		System.out.println(e2.asXML());
		System.out.println(e3.asXML());
		
		for(int i=0;i<list.size();i++){
			Element e = (Element)list.get(i);
//			System.out.println(e.asXML());
			Element n = e.element("name");
//			System.out.println(n.asXML());
			System.out.println(n.getText());//调用getText方法的元素中只有文本，
			System.out.println(e.attributeValue("id"));//attributeValue获取该元素的属性值(只能由元素进行调用)
		}
	}

}
