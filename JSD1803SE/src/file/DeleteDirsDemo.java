package file;

import java.io.File;

/**
 * ɾ��Ŀ¼ �� ͨ�÷���(���ۼ���)
 * ����delete����ɾ��Ŀ¼ʱҪ�������һ����Ŀ¼
 * ��ô��ʵ������У�������Ҫ�Ƚ�һ��Ҫɾ����Ŀ¼��պ�ſ��Խ���ɾ��
 * @author Administrator
 *
 */
public class DeleteDirsDemo {

	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/**
	 * ɾ��������File����ʾ���ļ���Ŀ¼--------->�㷨
	 * 
	 * �ݹ����
	 * �����ڲ������Լ������������Ϊ�ݹ����
	 * �ݹ��ܲ��þͲ��á����ŵݹ�Ĵ������ӣ��ڴ濪���ϴ�
	 * 
	 * ʹ�õݹ�
	 * 1.�ݹ����������һ����֧�п���
	 * 2.�㼶������
	 * 
	 * 
	 * ��ϰ:
	 * 1�����д���룬���1+2+3+4+...+100�����������ڴ����в��ó���for��while�ؼ���
	 * 2��1��Ǯһƿ  3��ƿ�ǻ�һƿ��ˮ  2����ƿ���Ի�1ƿ��ˮ������20��Ǯ�ܹ������򵽶���ƿ��
	 * @param file
	 */
	public static void delete(File file){
		if(file.isDirectory()){
			/**
			 * ����ո�Ŀ¼
			 * 1.��ȡ��Ŀ¼����������
			 * 2.����������һ��һ��ɾ��
			 */
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				delete(sub);
			}
		}
		file.delete();
	}

}
