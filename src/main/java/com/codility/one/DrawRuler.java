package com.codility.one;



public class DrawRuler {
	
	public static void main(String[] args) {
		new DrawRuler().drawRuler(3, 4);
	}
	
	public void drawRuler(int nInches, int majorLenght) {
		drawLine(majorLenght, 0);
		for(int j=1; j<=nInches;j++) {
			drawInterval(majorLenght-1);
			drawLine(majorLenght, j);
		}
		
	}
	
	public void drawInterval(int centralLength) {
		if(centralLength>=1) {
			drawInterval(centralLength-1);
			drawLine(centralLength);
			drawInterval(centralLength-1);
		}
		
	}
	
	public void drawLine(int tickLength, int tickLabel) {
		for(int j=0;j<tickLength;j++) 
			System.out.print("-");
		if(tickLabel>=0)System.out.print(" "+tickLabel);
		System.out.print("\n");
		
	}
	
	public void drawLine(int tickLength) {
		drawLine(tickLength, -1);
	}
	
	public void nothing() {
		
		 
		
		
	}

}
