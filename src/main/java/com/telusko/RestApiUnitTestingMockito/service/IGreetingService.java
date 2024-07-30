package com.telusko.RestApiUnitTestingMockito.service;

import com.telusko.RestApiUnitTestingMockito.controller.Tourist;

public interface IGreetingService {
	
	public String generateSomeWish();
	
	public boolean welcomeTourist(Tourist tourist);
	

}
