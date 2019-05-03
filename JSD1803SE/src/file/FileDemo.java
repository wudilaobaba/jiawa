package file;

import java.io.File;

/**
 * java.io.file
 * File的每一个实例可以用于表示文件系统中的一个文件或目录
 * 使用File可以：
 * 1：访问文件或目录的属性(名字、大小、修改时间等)
 * 2：操作文件或目录(创建、删除)
 * 3：访问一个目录的子项
 * 但是不能读写文件数据
 * @author Administrator
 *
 */
public class FileDemo {
	//相对路径可以做到跨平台，建议使用相对路径
	public static void main(String[] args) {
		File file = new File("./Demo.txt");//参数就是一个路径   在eclipse中./就是当前程序所在项目的路径--->D:\workspace\JSD1803SE
		String name = file.getName();
		System.out.println(name);
		//获取大小(字节数)
		long len = file.length();
		System.out.println(len);
		boolean cr = file.canRead();//可读
		System.out.println(cr);
		boolean cw = file.canWrite();//可写（将属性中的只读勾选上就不可写了）
		System.out.println(cw);
		boolean ih = file.isHidden();//是否是隐藏文件
		System.out.println(ih);
	}

}
