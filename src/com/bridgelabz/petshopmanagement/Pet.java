package com.bridgelabz.petshopmanagement;

public class Pet {
	enum Colour {
		BROWN, RED, BLACK, WHITE, GREEN, BLACK_WHITE, GREY
	}
	
	String id;
	String name;
	Colour colour;
	int price;
	
	public void eat () {
		System.out.println(getClass().getSimpleName() + "  eats.");
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
}