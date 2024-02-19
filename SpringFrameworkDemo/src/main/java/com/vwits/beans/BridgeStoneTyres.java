package com.vwits.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres{

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("BridgeStoneTyres...");
	}

}
