package com.valoyes.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgsApp {

	public static void main(String[] args) {
		
		// 1. creamos el aplication-context (container)
		// el beans-cp.xml tiene que estar en el class path
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// 2. creamos el bean
		Organization org = (Organization) ctx.getBean("myorg");

		// 3. invoke the company slogan via de bean
		org.comporateSlogan();
		
		// 3.1 impromir nuestro objecto Organization
		System.out.println(org);	

		// 4. cerramos el application conxtext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
