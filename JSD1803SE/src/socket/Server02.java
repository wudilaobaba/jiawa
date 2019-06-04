package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ҷ����  ��������ʹ�ö��߳�
 * @author Administrator
 *
 */
public class Server02 {
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
	public Server02(){
		try {
			System.out.println("����������");
			server = new ServerSocket(8087);
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
			while(true){
				System.out.println("�ȴ��ͻ�������....");
				//һ���пͻ��˽��룬�ͷ���һ��Socket,�������˾͸���һ��socket�ˣ���һ���Եȹ�ϵ���൱�����˶���һ���绰��
				Socket socket = server.accept(); // �ص�01.******�˴�ֻ������һ�Σ���Ҫ�ٽӵ绰���͵��ٵ�һ��
				// === ���ö��̣߳� ===���ö��߳����ӵ绰��ֻҪ�пͻ��˴��������һ���߳�ȥִ�н�������������
				System.out.println("һ���ͻ���������");
				//�����߳�:
				Thread t1 = new Thread(new ClientHandler(socket));
				t1.start();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server02 server = new Server02();
		server.start();
	}
	
	/**
	 * ���̸ֳ�����ָ���ͻ��˵Ľ�������
	 * @author Administrator
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		public ClientHandler(Socket socket){
			this.socket = socket;
		} 
		public void run(){
			//���½���������
			try {
				//���¼��Ϊ->���룺IB.readLine();
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");//���߱����ʽ����һ��
				BufferedReader br = new BufferedReader(isr);
				/*
				 *ͨ��Socket��ȡ����������ڸ��ͻ��˷�����Ϣ 
				 */
				PrintWriter pw = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream(),"UTF-8")
					),true
				);
				
				/*
				 * ���ͻ��������˶Ͽ�����ʱ����ͬϵͳ�Ŀͻ����ڷ����������ֵĲ�̫һ����
				 * win�Ŀͻ��˶Ͽ�ʱ�����������br.readLine����ͨ����ֱ���׳��쳣
				 * linus�Ŀͻ��˶Ͽ�ʱ�������br.readLine�����᷵��null.
				 */
				String str = null;
				while((str = br.readLine())!=null){// �ص�02.***********�˴���ѭ���൱��һֱ���ҵ绰,���while��һֱһ�ͻ�Tom������ϵ��������������
					System.out.println("�ͻ���˵��"+str);
					//����Ϣ�ٻظ����ͻ���
					pw.println("�����˵��"+str);
				}
			} catch (IOException e) {
				e.printStackTrace();//win�Ŀͻ��˶Ͽ�ʱ�����������br.readLine����ͨ����ֱ���׳��쳣
			}
		}
	}
	
}
