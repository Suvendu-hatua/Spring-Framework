package com.vwits.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
	
	@Autowired
	private Speaker speaker;
	
	@Autowired
	private Tyres tyres;
	

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public Tyres getTyres() {
		return tyres;
	}

	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}
	
	
}
