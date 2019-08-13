package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backhand ball";
	}

}
