package com.care.ex01;

import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {
	public void commonAOP(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();//comminAop 기능이 일시중지되고 coreclass가 실행된다
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
