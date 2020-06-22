package com.care.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect //"공통기능으로 사용하겠다" 라는 어노테이션
public class CommonClass {
	@Around("within(com.care.ex02.*)")
	public void commonAOP(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();//comminAop 기능이 일시중지되고 coreclass가 실행된다
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	@Before("execution(* com.care.ex02.CoreClass.test())")
	public void beforeAdvice() {
		System.out.println("===핵심기능 실행전 실행 됩니다===");
	}
}
