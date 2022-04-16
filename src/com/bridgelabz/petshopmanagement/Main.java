package com.bridgelabz.petshopmanagement;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Pet shop !");
		
		Dog dog = new Dog();
		dog.id = "D001";
		dog.price = 1000;
		
		Cat cat = new Cat();
		cat.id = "C005";
		cat.price = 500;
		
		Parrot parrot = new Parrot();
		parrot.id = "P002";
		parrot.price = 600;
		
		Pigeon pigeon = new Pigeon();
		pigeon.id = "PG003";
		pigeon.price = 200;
		
		Duck duck = new Duck();
		duck.id = "DK04";
		duck.price = 250;
		
		Mouse mouse = new Mouse();
		mouse.id = "M02";
		mouse.price = 150;
		
		PetRepository petRepo = new PetRepository();
		petRepo.add(cat);
		petRepo.add(dog);
		petRepo.add(parrot);
		petRepo.add(pigeon);
		petRepo.add(mouse);
		
		UserInterface userInterface = new UserInterface();
		userInterface.printAllPets(petRepo.getPetList());
		
		petRepo.remove(pigeon);
		petRepo.remove(mouse);
		System.out.println("Updated list :");
		userInterface.printAllPets(petRepo.getPetList());
	}
}
