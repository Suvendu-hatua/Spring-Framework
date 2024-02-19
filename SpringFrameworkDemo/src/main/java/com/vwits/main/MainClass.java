package com.vwits.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vwits.beans.Person;
import com.vwits.beans.Vehicle;
import com.vwits.configuration.ProjectConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		Vehicle vehicle=context.getBean(Vehicle.class);
//		Vehicle vehicle=context.getBean("Bently Car",Vehicle.class);
		
//		System.out.println(vehicle.getName());
		
		Person person=context.getBean(Person.class);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getVehicle().getName());
		person.getVehicle().getVehicleServices().getSpeaker().makeSound();
		
		person.getVehicle().getVehicleServices().getTyres().rotate();
//		
//		vehicle.getVehicleServices().getTyres().rotate();

		
//		context.close();
		
	}

}
