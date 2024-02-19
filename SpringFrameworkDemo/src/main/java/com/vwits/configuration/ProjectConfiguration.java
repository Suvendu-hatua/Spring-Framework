package com.vwits.configuration;

import org.springframework.context.annotation.ComponentScan;


@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = {"com.vwits.beans"})
public class ProjectConfiguration {
	
//	@Bean(name = "Audi Car")
//	public Vehicle vehicle1() {
//		Vehicle vehicle=new Vehicle();
//		vehicle.setName("Audi Car");
//		return vehicle;
//	}
//	
////	@Primary
//	@Bean(name = "Bently Car")
//	public Vehicle vehicle2() {
//		Vehicle vehicle=new Vehicle();
//		vehicle.setName("Bently Car");
//		return vehicle;
//	}
//	
//	@Bean(name = "Volkswagen Car")
//	public Vehicle vehicle3() {
//		Vehicle vehicle=new Vehicle();
//		vehicle.setName("Volkswagen Car");
//		return vehicle;
//	}
}
