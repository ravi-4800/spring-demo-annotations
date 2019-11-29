package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve beans from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call the methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods... has the props values injected
		
		System.out.println("Email: " + theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
		
		// close the context
		context.close();

	}

}
