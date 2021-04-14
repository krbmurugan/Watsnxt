package com.rs.watsnxt.accessmodifiers;

public class Finaltest {
	public AnimalClass d = new AnimalClass("Dog", false, 10);
	final AnimalClass li = new AnimalClass("Lion", true, 12);
	 String name = "Bala";
	
	
	public static void main(String[] args) {
		
		Finaltest f = new Finaltest();
		f.li.setName("Tiger");
		AnimalClass lo =new AnimalClass("Cat", false, 13);

		
		
		
		
	}

}
