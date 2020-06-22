package com.care.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:applicationAOP_02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		CoreClass tc = ctx.getBean("core",CoreClass.class);
		System.out.println("main start");
		tc.corePrint();
		tc.corePrint02();
		System.out.println("main end!");
		
		
	}
}
