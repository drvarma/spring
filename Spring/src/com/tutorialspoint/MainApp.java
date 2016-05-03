package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {

      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      InitHelloWorld h = (InitHelloWorld)context.getBean("hello");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      
      obj.getMessage();
      context.registerShutdownHook();
   }
}