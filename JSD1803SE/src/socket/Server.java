package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ҷ����
 * @author Administrator
 *
 */
public class Server {
	/**
	 * �����ڷ���˵�jave.net.ServerScoket
	 * ��Ҫ���������ã�
	 * 1.��ϵͳ�������˿ڣ��ͻ��˾���ͨ������˿������˽������ӵ�
	 * 2.��������˿ڣ��ȴ��ͻ������ӣ���ôServerSocket����������һ��Socket��ͻ��˽���ͨѶ��
	 */
	private ServerSocket server;
	/**
	 * ������ʼ�������
	 */
	public Server(){
		try {
			System.out.println("����������");
			server = new ServerSocket(8085);
			System.out.println("�������������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ����˿�ʼ�����ķ���
	 */
	public void start(){
		//server.accept() �÷���������
		try {
			/**
			 * ServerSocket�ṩ�ķ�����Socket accept()
			 * �÷�����һ���������������ú����������ֱ��һ���ͻ�������Ϊֹ����ʱ�÷�������һ��Socket������ս������ӵĿͻ��˽���ͨѶ
			 */
			System.out.println("�ȴ��ͻ�������....");
			//һ���пͻ��˽��룬�ͷ���һ��Socket,�������˾͸���һ��socket�ˣ���һ���Եȹ�ϵ���൱�����˶���һ���绰��
			Socket socket = server.accept(); 
			System.out.println("һ���ͻ���������");
			
			//...������....
			
			//************************ һ���ͻ��������ݽ��룬��ִ�����´��룺******************************
			InputStream in = socket.getInputStream();
			//���¼��Ϊ->���룺IB.readLine();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");//���߱����ʽ����һ��
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			while(true){
				System.out.println("daddasddasdasdasd");
				str= br.readLine();//���������з����ַ���  //***readLine()����������***
				System.out.println("�ͻ���˵��"+str);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
}
