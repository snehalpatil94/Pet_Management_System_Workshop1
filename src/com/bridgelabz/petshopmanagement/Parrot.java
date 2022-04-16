package com.bridgelabz.petshopmanagement;

public class Parrot extends Pet implements Flyable{
	
	public Parrot() {
		name = "PARROT";
		colour = Colour.RED;		
	}
	
	@Override
	public void fly() {
		System.out.println("Parrot fly");
	}
}
