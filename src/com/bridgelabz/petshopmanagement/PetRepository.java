package com.bridgelabz.petshopmanagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PetRepository {
	private List petList = new ArrayList();
	private List aaa = new LinkedList<>();
	
	public List getPetList() {
		return petList;
	}

	public void add(Pet pet) {
		petList.add(pet);
	}
	
	public void remove(Pet pet) {
		petList.remove(pet);
	}
}