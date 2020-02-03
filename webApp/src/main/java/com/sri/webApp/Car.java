package com.sri.webApp;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("It's Driving");
	}

}
