package come.tedu.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * HttpRequest��ʾһ��	HttpЭ��Ҫ���������Ϣ
 * һ���������������
 * �����С���Ϣͷ����Ϣ����
 * @author Administrator
 *
 */
public class HttpRequest {
	//��Ӧ�ͻ��˵�socket
	private Socket socket;
	//ͨ��socket��ȡ�������������ڶ�ȡ�ͻ��˷��͵�����
	private InputStream in;
	
	//����������Ŷ���
	//����ʽ
	private String method;
	//��Դ·��
	private String url;
	//����ʹ�õ�Э��汾
	private String protocol;
	
	//��Ϣͷ��ض���
	private Map<String,String> headers = new HashMap();
	
	
	//ֻ�����������ṩ����get����������
	public String getMethod() {
		return method;
	}
	public String getUrl() {
		return url;
	}
	public String getProtocol() {
		return protocol;
	}
	//�ṩ��ȡ��Ϣͷ��Ϣ�ķ���
	public String getHeader(String name){
		return headers.get(name);
	}
	
	/**
	 * ʵ����HttpRequestʹ�õĹ��췽������Ҫ����Ӧ�Ŀͻ��˵�Socket���룬�Ա��ȡ�ÿͻ��˷��͹�������������
	 * @param socket
	 */
	public HttpRequest(Socket socket){
		try{
			this.socket = socket;
			this.in = socket.getInputStream();
			//1.����������
			parseRequestLine();
			//2.������Ϣͷ
			parseHeaders();
			//3.������Ϣ����
			parseContent();
			//this socket = socket;
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	/**
	 * ����������  ����Ҫ�������þ���private
	 */
	private void parseRequestLine(){
		/*
		 * ��������:
		 * 1.ͨ����������ȡ��һ��
		 * 2.�������а��տո���Ϊ����
		 * 3.����ֵ�����ֱ����õ�method,utl,protocol����������
		 * ����������ʱ���ڻ�ȡ��ֺ������Ԫ��ʱ�����ܻ����������±�Խ�磬��������HTTPЭ������ͻ��˷���һ��������������µ�
		 * ���Ǻ�����
		 */
		String[] str = readLine().split("\\s");
		method = str[0];
		url = str[1];
		protocol = str[2];
	}
	/**
	 * ������Ϣͷ  ����Ҫ�������þ���private
	 * ���²��裺
	 * 1.����ʹ��readLine������ȡ����������
	 * 	 ÿһ��Ӧ�ö���һ����Ϣͷ
	 * 2.��readLine��������ֵΪ���ַ���ʱ��ֹͣѭ����ȡ����(����������CRLFʱ��readLine��������ֵӦ���ǿ��ַ���)
	 * 3.ÿ����ȡһ����Ϣͷ��ϢʱӦ������": "���Ϊ�����һ��Ϊ��Ϣͷ���֣��ڶ���Ϊ��Ϣͷ��Ӧ��ֵ����������Ϊkey,��ֵ��Ϊ
	 * value���뵽����headers���Map��
	 */
	private void parseHeaders(){
		System.out.println("������Ϣͷ");
		while(true){
			String str = readLine();
			if("".equals(str)){
				break;
			}
			headers.put(str.split(":\\s")[0], str.split(":\\s")[1]);
		}
		System.out.println(headers);
//		
	}
	/**
	 * ������Ϣ����  ����Ҫ�������þ���private
	 */
	private void parseContent(){
		System.out.println("������Ϣ����");
	}
	
	/**
	 * ͨ����������������ȡһ���ַ���(��CRLF��β)
	 * @param in
	 * @return 
	 */
	private String readLine(){
		StringBuilder builder = new StringBuilder();
		try {
			int d=-1;
			//c1��ʾ�ϴζ������ַ���c2��ʾ���ζ������ַ�
			char c1 = 'a' , c2 = 'a';
			while((d=in.read())!=-1){
				c2 = (char)d;
				/*
				 * ��ASC�����У�CR�ı����Ӧ������Ϊ13  LF�����Ӧ������Ϊ10
				 * �ͺñ��ַ�a�ı����Ӧ������Ϊ97
				 */
				if(c1==13&&c2==10){
					
					break;
				}
				builder.append(c2);
				c1 = c2;
			}
			return builder.toString().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	
}
