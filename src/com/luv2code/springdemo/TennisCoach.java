package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component("theSillyCoach")
@Component  // default bean ID would be tennisCoach
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	// define the init method
//	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define the destroy method
//	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside of doMyCleanupStuff()");
	}
	
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("TennisCoach: inside setFortuneService() method");
	 * this.fortuneService = fortuneService; }
	 */
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) { super();
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
