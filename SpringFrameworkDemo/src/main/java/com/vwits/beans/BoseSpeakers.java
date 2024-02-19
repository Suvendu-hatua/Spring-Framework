package com.vwits.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speaker{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("BoseSpeakers..");
	}

}
