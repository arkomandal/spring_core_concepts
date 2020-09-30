package com.springway.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;


public class Mobile {
	public static void main(String args[]) {
		
		System.out.println("hello world");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//specific
		Airtel air = (Airtel)context.getBean("airtel");
		System.out.println(air.getCalling());
		System.out.println(air.getData());
		
		//specific
		Vodafone voda = context.getBean("vodafone", Vodafone.class);
		System.out.println(voda.getCalling());
		System.out.println(voda.getData());
		
		//generic
		Sim sim = context.getBean("sim", Sim.class);
		System.out.println(sim.getCalling());
		System.out.println(sim.getData());
		
	}
}