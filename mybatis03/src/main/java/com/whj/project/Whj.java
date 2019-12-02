package com.whj.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Whj {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc.xml");
	}
}
