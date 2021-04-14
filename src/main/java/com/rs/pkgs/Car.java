package com.rs.pkgs;

public class Car {
	
	static Car inst = null;
	
	private Car() {
		// TODO Auto-generated constructor stub
	}
	
	public static Car getInstance() {
		
		if(inst == null) {
			inst = new Car();
		}
		
		return inst;
	}

}
