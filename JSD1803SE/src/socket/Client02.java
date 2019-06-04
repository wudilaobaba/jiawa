package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * �����ҿͻ��� ��������ʹ�ö��߳�
 * @author Administrator
 *
 */
public class Client02 {
	/*
	 *java.net.Scoket �׽���
	 *��װ��TCPЭ��ͨѶ��ʹ�������Ժܷ������TCPЭ��ΪͨѶ��ʽ�������ݴ��� 
	 */
	private Socket socket; //�������Ϊһ���绰
	//Socket�������˷������ʱ�򣬰��Լ��������IP+�˿ں�Ҳ����ȥ�ˣ�������˶˿ں�����Socket�Զ�����ģ�����Ҫ��Ϊ���ã�
	//Ȼ�����˷��ظ��ͻ������ݵ�ʱ�򣬾Ͱ��շ���˶�Ӧ��IP+�˿ڽ��ж�λ
	//ͨ��IP��ַ�����ҵ�����˼������ͨ���˿ںſ����ҵ������ڷ���˼�����ϵķ����Ӧ�ó���
	public Client02(){
		try {
			//ʵ����Socket�Ĺ��̾�ʱ�����ӵĹ��̣�������ʧ����ô������׳��쳣
			System.out.println("�������ӷ�����...");
			socket = new Socket("127.0.0.1",8087); //����ΪIP��˿ںţ��ͻ������������ˣ�һ��Ҫ�ҵ���Ӧ����˵�IP+�˿ں�
			System.out.println("������");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			//�Լ�д��scanner
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					System.in
				)
			);
			
			//OutputStream��һ�������࣬��Ȼ����new��ʵ���������ǿ����������ͣ��������ָ������***
			OutputStream out = socket.getOutputStream();//����OutputStream������
			//���¼��Ϊ->д����OBP.println(String str)
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
			BufferedWriter bs = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bs,true);
			
			//������������ȡ�������Ϣ
			BufferedReader in = new BufferedReader(
				new InputStreamReader(
					socket.getInputStream(),"UTF-8"
				)
			);
			
			System.out.println("��ʼ�����");
			String str = null;
			while(true){
				str = br.readLine(); //***readLine()����������***
				pw.println(str);//�þ���ϻ��з����������������������
				
				str = in.readLine();
				System.out.println(str);
			}
			
			//out.write(str.getBytes("utf-8"));//�þ�������������������
//			pw.println(str);//�þ���ϻ��з����������������������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client02 client = new Client02();
		client.start();
	}
}
