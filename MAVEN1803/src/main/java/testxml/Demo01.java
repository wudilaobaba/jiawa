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
		 *����dom4j��ȡXML�ļ� 
		 */
		FileInputStream fis = new FileInputStream("books.xml");
		SAXReader reader = new SAXReader();
		//���XML�ļ���ʽ���������쳣
		Document doc = reader.read(fis);
		fis.close();
		//���doc
		//System.out.println(doc.asXML());
		Element root = doc.getRootElement();
		//Element���͵Ķ��󣬾ʹ���xml�ļ��е�һ��Ԫ��
		//���root��Ϣ����������Ԫ�ص�ȫ������
//		System.out.println(root.asXML());
		
		//���Ҹ�Ԫ�صĵ�һ����Ԫ��
		Element book = root.element("book");//-----01.����root�е�һ�������������Ԫ��(�ʺϲ�����Ψһ��Ԫ�ص����)
//		System.out.println(book.asXML());
		
		//����books��ȫ����Ԫ��
		List list = root.elements();//------------02.����root��ȫ����Ԫ��(���������ֲ���ȫ����Ԫ��)
		list.size();//===========����list��Ԫ�صĸ���
		//List list = root.elements("book-xxx");//----03.����Ԫ���������ǲ���book��������Ԫ��(��Ԫ�غܶ࣬����Ԫ�����ֲ���ͬ���ҳ�������ͬ��һ����Ԫ��)
//		System.out.println(list);
		//List��һ�����ϣ��൱��һ�����飬�洢��books��ȫ����Ԫ��(3��book)
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
			System.out.println(n.getText());//����getText������Ԫ����ֻ���ı���
			System.out.println(e.attributeValue("id"));//attributeValue��ȡ��Ԫ�ص�����ֵ(ֻ����Ԫ�ؽ��е���)
		}
	}

}
