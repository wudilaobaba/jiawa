package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 06 使用当前类的实例测试对象流读写对象的操作
 * 当一个类的实例要被对象流进行读写时，要求该类必须实现Serializable接口， 
 * 就是一个空接口(可序列化接口)，里面什么也没有(java中预设好的，编译的时候会自动多一个方法)
 * @author Administrator
 *
 */
public class Person implements Serializable{
	/**
	 * 这里自己将Serializable接口的序列化版本号生成出来，点击类左侧的黄色灯泡，选择默认的即可生成下面一行
	 * 序列化版本号直接影响反序列化是否会成功(只要两边的版本号一致才能成功)
	 * 不加，自动生成(类的结构不变，默认的版本号不变，类的结构一改变，默认版本号就变)
	 * 类结构改变的意思是：类的属性值或属性改变
	 * 
	 * 若当前类结构发生了变化，只要版本号没有改变，那么反序列化时会将仍然有的属性进行还原
	 * 
	 * 反序列化会与当前对象进行匹配，如果原来有的属性现在没有了，那么就忽略掉原有属性
	 * 						  如果现在的有了新属性，那么原来的对象会给这个新属性赋默认值
	 */
	private static final long serialVersionUID = 1L;//建议自己定义版本号
	private String name;
	private int age;
	private String gender;
	private transient String[] otherInfo;
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String toString(){
		return name+","+age+","+gender+","+Arrays.toString(otherInfo);
	}
	
}