package org.cuatrovientos.larris.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Fleet fleet = (Fleet) context.getBean("fleet1");
		
		System.out.print(fleet.toString());
	}
}
