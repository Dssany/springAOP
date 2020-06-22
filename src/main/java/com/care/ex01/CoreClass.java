package com.care.ex01;

public class CoreClass {
	public void corePrint() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
				System.out.println("핵심 기능 실행!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
