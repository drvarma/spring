package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("execution(* com.spring.aop.model.*.get*())")
	public void loggingAdvice(){
		System.out.println("Advice method");
	}
	
	@Before("allGetters()")
	public void secondLoggingAdvice(){
		System.out.println("Second Advice method");
	}
	
	@Pointcut("within(com.spring.aop.model.Circle)")
	public void allGetters(){}
}
