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
import java.util.Arrays;

/**
 * �����ҷ����  ��������ʹ�ö��߳�
 * @author Administrator
 *
 */
public class Server03 {
	/**
	 * �����ڷ���˵�jave.net.ServerScoket
	 * ��Ҫ���������ã�
	 * 1.��ϵͳ�������˿ڣ��ͻ��˾���ͨ������˿������˽������ӵ�
	 * 2.��������˿ڣ��ȴ��ͻ������ӣ���ôServerSocket����������һ��Socket��ͻ��˽���ͨѶ��
	 */
	private ServerSocket server;
	
	/**
	 * ����ClientHandler��Server���ڲ��࣬��ô��Server�϶�������Կ��Ա�ClientHandler��ʵ�����ʣ��Ӷ�����
	 * ����������ClientHandler��������ʹ�á�
	 */
	private PrintWriter[] allOut = {};
	/**
	 * ������ʼ�������
	 */
	public Server03(){
		try {
			server = new ServerSocket(8087);
		} catch (IOException e) {
			//TODO 
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
				//һ���пͻ��˽��룬�ͷ���һ��Socket,�������˾͸���һ��socket�ˣ���һ���Եȹ�ϵ���൱�����˶���һ���绰��
				Socket socket = server.accept(); // �ص�01.******�˴�ֻ������һ�Σ���Ҫ�ٽӵ绰���͵��ٵ�һ��
				// === ���ö��̣߳� ===���ö��߳����ӵ绰��ֻҪ�пͻ��˴��������һ���߳�ȥִ�н�������������
				System.out.println("һ���ͻ���������");
				//�����߳�:
				Thread t1 = new Thread(new ClientHandler(socket));//�ڲ���ClientHandler���Է����ⲿ�������
				t1.start();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server03 server = new Server03();
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
			PrintWriter pw = null;
			//���½���������
			try {
				//���¼��Ϊ->���룺IB.readLine();
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");//���߱����ʽ����һ��
				BufferedReader br = new BufferedReader(isr);
				/*
				 *ͨ��Socket��ȡ����������ڸ��ͻ��˷�����Ϣ 
				 */
				pw = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream(),"UTF-8")
					),true
				);
				
				//�������������allOut�У��Ա�������ClientHandler���Խ���Ϣ���͸���ǰ�ͻ���
				allOut = Arrays.copyOf(allOut, allOut.length+1);//������
				allOut[allOut.length-1] = pw;//����ǰ�ͻ�������������������
				System.out.println("��ǰ����������" + allOut.length);
				
				/*
				 * ���ͻ��������˶Ͽ�����ʱ����ͬϵͳ�Ŀͻ����ڷ����������ֵĲ�̫һ����
				 * win�Ŀͻ��˶Ͽ�ʱ�����������br.readLine����ͨ����ֱ���׳��쳣
				 * linus�Ŀͻ��˶Ͽ�ʱ�������br.readLine�����᷵��null.
				 */
				String str = null;
				while((str = br.readLine())!=null){// �ص�02.***********�˴���ѭ���൱��һֱ���ҵ绰,���while��һֱһ�ͻ�Tom������ϵ��������������
					System.out.println("�ͻ���˵��"+str);
					//����Ϣ�ٻظ����ͻ���
//					pw.println(str);
					//����allOut,ת����Ϣ����ʱΪ�����пͻ��˷���Ϣ
					for(int i=0;i<allOut.length;i++){
						allOut[i].println(str);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();//win�Ŀͻ��˶Ͽ�ʱ�����������br.readLine����ͨ����ֱ���׳��쳣
			} finally{
				//����ͻ��˶Ͽ�ʱ���߼�
				//���ÿͻ��˵�������ӹ���������ɾ��,��pw��allOut��ɾ��
				for(int i=0;i<allOut.length;i++){
					if(pw == allOut[i]){
						System.out.println(i);
						allOut[i] = allOut[allOut.length-1];
						allOut = Arrays.copyOf(allOut, allOut.length-1);
						break;
					}
				}
				System.out.println("��ǰ����������" + allOut.length);
				if(socket!=null){ //�ر�socket,�ͷ���Դ
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
