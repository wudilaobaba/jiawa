package file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
	/**
	 * File�ṩ��һ�����ص�listFiles����������ָ��һ���ļ���������
	 * Ȼ��һ��Ŀ¼�����������Ҫ�������ء�
	 * ������������
	 * ��ȡ��ǰĿ¼�������ı��ļ�(��������ʹ��)
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File(".");//��ǰĿ¼
		File[] subs = dir.listFiles(new FileFilter(){ //���������
			public boolean accept (File file){
//				String name = file.getName();
//				System.out.println("���ڹ���"+name);
//				return name.endsWith(".txt");
				return file.isDirectory();
			}
		});
		//Ϊ�˼������ڲ��࣬����ʹ�����µ�lambda���ʽ(����ὲ)
//		File[] subs = dir.listFiles(
//			(file)->file.getName().endsWith(".txt")
//		);
		System.out.println(subs.length);//ֻ������.txt��β���ļ�
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}
