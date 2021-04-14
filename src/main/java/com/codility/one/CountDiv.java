package com.codility.one;

public class CountDiv {
	public static void main(String[] args) {
		CountDiv cd = new CountDiv();
		cd.solution(250157328, 482381288, 6257);
		
	}
	
	public int solution(int A, int B, int K) {
		int aq=A/K;
		int bq=B/K;
		aq=A%K==0?aq-1:aq;		
		int countDiv = bq-aq;
		System.out.println(aq+"="+bq+"=="+countDiv);		
		return countDiv;
	}
	
	

}
