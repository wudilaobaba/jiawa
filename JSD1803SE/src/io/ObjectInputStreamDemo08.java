package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 08.
 * 对象输入流，用于进行对象反序列化操作(还原为真正的对象)
 * 需要注意，对象流读取的字节必须是由对象输出流将一个对象序列化后的字节，否则进行反序列化时会抛出异常
 * @author Administrator
 *
 */
public class ObjectInputStreamDemo08 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("./person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		//ois.readObject();是Object类型
		System.out.println(p);
		ois.close();
	}

}
