package com.vwits.beans;

import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speaker {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeakers...");
	}

}
