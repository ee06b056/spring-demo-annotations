package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach (FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	public TennisCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
