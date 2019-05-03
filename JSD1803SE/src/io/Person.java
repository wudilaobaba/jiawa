package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 06 ʹ�õ�ǰ���ʵ�����Զ�������д����Ĳ���
 * ��һ�����ʵ��Ҫ�����������ж�дʱ��Ҫ��������ʵ��Serializable�ӿڣ� 
 * ����һ���սӿ�(�����л��ӿ�)������ʲôҲû��(java��Ԥ��õģ������ʱ����Զ���һ������)
 * @author Administrator
 *
 */
public class Person implements Serializable{
	/**
	 * �����Լ���Serializable�ӿڵ����л��汾�����ɳ�������������Ļ�ɫ���ݣ�ѡ��Ĭ�ϵļ�����������һ��
	 * ���л��汾��ֱ��Ӱ�췴���л��Ƿ��ɹ�(ֻҪ���ߵİ汾��һ�²��ܳɹ�)
	 * ���ӣ��Զ�����(��Ľṹ���䣬Ĭ�ϵİ汾�Ų��䣬��Ľṹһ�ı䣬Ĭ�ϰ汾�žͱ�)
	 * ��ṹ�ı����˼�ǣ��������ֵ�����Ըı�
	 * 
	 * ����ǰ��ṹ�����˱仯��ֻҪ�汾��û�иı䣬��ô�����л�ʱ�Ὣ��Ȼ�е����Խ��л�ԭ
	 * 
	 * �����л����뵱ǰ�������ƥ�䣬���ԭ���е���������û���ˣ���ô�ͺ��Ե�ԭ������
	 * 						  ������ڵ����������ԣ���ôԭ���Ķ�������������Ը�Ĭ��ֵ
	 */
	private static final long serialVersionUID = 1L;//�����Լ�����汾��
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