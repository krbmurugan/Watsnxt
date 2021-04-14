package com.rs.watsnxt.functionalInterfaces;

import java.util.function.Function;

public class Demo01 {
	
	public static void main(String[] args) {
		
		Function<String, String> fn = (param) ->  param +" from Redsoil";
		
		System.out.println(fn.apply("hii"));
		
		Demo01 d1 = new Demo01();
		String s = d1.add("Hello Balamurugan", fn);
		
		System.out.println(s);
		
		FunctionalInter fi = (x)-> "Hello..."+x;
		System.out.println(fi.add("Bala"));
		
		
		System.out.println(fi.add("Murugan"));
		
		Runnable r = ()->System.out.println("aa");
		r.run();
		
		new Thread(()-> System.out.println("aa")).start();
		
	}
	
	public String add(String msg, Function<String, String> fn) {
		
		return fn.apply(msg);
	}

}
