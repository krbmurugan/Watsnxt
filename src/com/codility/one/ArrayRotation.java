package com.codility.one;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] input =new int[]{3,8,9,7,6};
		System.out.println(Arrays.toString(input));
		int[] output = new int[input.length];
		int rotByPos = 3;
		for(int i=0; i<input.length; i++) {
			int newPos = i+rotByPos;
			if(newPos>=input.length) {
				output[newPos-input.length]=input[i];
//				System.out.println(output[newPos-input.length]);
			}
			else {
				output[newPos]=input[i];
//				System.out.println(output[newPos]);
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(output));
		
		 
		
	}

}
