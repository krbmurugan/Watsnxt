package com.codility.one;

public class FrogJump {
	public static void main(String[] args) {
		System.out.println(new FrogJump().solution(25, 85, 30));
		
		
	}
	
	public int solution(int X, int Y, int D) {
		int numOfJumps =0;
		numOfJumps = (Y-X)/D;
		if((Y-X)%D>0)  numOfJumps=numOfJumps+1;
		
		return numOfJumps;
		
	}

}
