package com.vwits.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vwits.interfaces.VehicleServices;

@Component
public class Vehicle {
	private String name="Volkswagen";
	
	@Autowired
	private VehicleServices vehicleServices;
	
	

	public VehicleServices getVehicleServices() {
		return vehicleServices;
	}

	public void setVehicleServices(VehicleServices vehicleServices) {
		this.vehicleServices = vehicleServices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@PostConstruct
//	public void postAssign() {
//		this.name="Volkswagen";
//		System.out.println("After the object creation...");
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		System.out.println("Defore deleting the object.....");
//	}
	
}
