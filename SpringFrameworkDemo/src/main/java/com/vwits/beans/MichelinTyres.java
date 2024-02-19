package com.vwits.beans;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres{

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("MichelinTyres...");
	}

}
