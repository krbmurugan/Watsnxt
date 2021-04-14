package com.rs.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {
	
	public static void main(String[] args) {
//		var list = Arrays.asList("Orange", "Apple", "Banana", "Grape");
		
		int[] i = new int[] {1,2,3,4,5};
		i[4] = 6;
		
		int[] k = new int[3];
		k[0]=1;
		k[1] = 7;
		k[2] = 90;
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		Arrays.stream(k).forEach(e->a.add(e));
		System.out.println(a);
		Arrays.stream(k).forEach(System.out::println);
		
		
		
		System.out.println(i.length);
		
	 
	}

}
class InstanceMethodReference2 {  
    public void printnMsg(){  
        System.out.println("Hello, this is instance method");  
    }  
    public static void main(String[] args) {  
    Thread t2=new Thread(new InstanceMethodReference2()::printnMsg);  
        t2.start();       
    }  
}  
