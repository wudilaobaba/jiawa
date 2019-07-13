package come.tedu.webserver.http;

import java.io.InputStream;
import java.net.Socket;
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
	
	/**
	 * ʵ����HttpRequestʹ�õĹ��췽������Ҫ����Ӧ�Ŀͻ��˵�Socket���룬�Ա��ȡ�ÿͻ��˷��͹�������������
	 * @param socket
	 */
	public HttpRequest(Socket socket){
		this.socket = socket;
		//1.����������
		parseRequestLine();
		//2.������Ϣͷ
		parseHeaders();
		//3.������Ϣ����
		parseContent();
		//this socket = socket;
		
		
	}
	/**
	 * ����������  ����Ҫ�������þ���private
	 */
	private void parseRequestLine(){
		System.out.println("����������");
		System.out.println("�����н������");
	}
	/**
	 * ������Ϣͷ  ����Ҫ�������þ���private
	 */
	private void parseHeaders(){
		System.out.println("������Ϣͷ");
	}
	/**
	 * ������Ϣ����  ����Ҫ�������þ���private
	 */
	private void parseContent(){
		System.out.println("������Ϣ����");
	}
}
