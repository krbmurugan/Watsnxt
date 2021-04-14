package com.rs.watsnxt.accessmodifiers;

public class AnimalClass {
	
	public String name;
	public boolean isWild;
	
	public final int age;
	public AnimalClass(String name, boolean isWild, int age) {
		super();
		this.name = name;
		this.isWild = isWild;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWild() {
		return isWild;
	}
	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}
	
	
	

}
