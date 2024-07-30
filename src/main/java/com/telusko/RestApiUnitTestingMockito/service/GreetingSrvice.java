package com.telusko.RestApiUnitTestingMockito.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.telusko.RestApiUnitTestingMockito.controller.Tourist;

@Service
public class GreetingSrvice implements IGreetingService{

	@Override
	public String generateSomeWish() {
		
		LocalDateTime datetime = LocalDateTime.now();
		int hour=datetime.getHour();
		String wish=null;
		if(hour<12)
		{
			wish="Good Morning";
		}
		else if(hour<16)
		{
			wish="Good Afternoon";
		}
		else if(hour<20)
		{
			wish="Good Evening";
		}
		else
		{
			wish="Good night";
		}
		return wish;
	}

	@Override
	public boolean welcomeTourist(Tourist tourist) {
		
		String msg = "Welcome Tourist to our Java Spring Boot City";
		
		return true;
	}

	

}
