package com.bridgelabz.petshopmanagement;

public class Duck extends Pet implements Flyable , Swimable {

	@Override
	public void fly() {
		System.out.println("Duck fly");
	}
	
	@Override
	public void swim() {
		System.out.println("Duck swim");
	}
	
	
}
