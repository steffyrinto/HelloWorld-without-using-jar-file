package com.face.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhelloworld.HelloWorld;

public class Main {
	public static void main(String[] args) {
		 ApplicationContext a=new ClassPathXmlApplicationContext("resources/NewFile.xml");
		 HelloWorld mybean=(HelloWorld) a.getBean("helloworld");
		 mybean.display();
		 
	 }

}
