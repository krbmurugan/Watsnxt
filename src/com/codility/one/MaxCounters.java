package com.codility.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MaxCounters {
	
	public static void main(String[] args) {
		
		int A[] = new int[] {3, 4, 4, 6, 1, 4, 4};
		int K =5;
		
		
//		Arrays.toString(new MaxCounters().solution(K, A));
		Arrays.toString(new MaxCounters().solution2(K, A));
//		Arrays.sort(A);
//		System.out.println(Arrays.toString(A));
//		Arrays.fill(A, 9);
//		System.out.println(Arrays.toString(A));
		
		
	}
	
	public int[] solution(int N, int[] A) {
		System.out.println(Arrays.toString(A));
		int O[]= new int[N];
		int max =0;
		
		splitArrays(A, N);
		
		for(int i=0;i<A.length;i++) {
			if(A[i]<=N) {
				int val = O[A[i]-1]+1;
				max = val > max?val:max;
				O[A[i]-1]=val;
			}
			if(A[i]>N) Arrays.fill(O, max);
			System.out.println(Arrays.toString(O));
			

		}
	
		System.out.println(Arrays.toString(O));
		return O;
	}
	
	public int[] solution2(int N, int[] A) {
		List splitArrays = new MaxCounters().splitArrays(A, N);
		
		int updatElementValues = 0;
		int O[]= new int[N];
		
		for (int i=0;i<splitArrays.size();i++) {
			int a[] = (int[])splitArrays.get(i);
			List<Integer> collect1 = Arrays.stream( a ).boxed().collect( Collectors.toList() );
			if (i==splitArrays.size()-1) {
				System.out.println("Updating last section"+ collect1);
				System.out.println("updatElementValues"+updatElementValues);
				Arrays.fill(O, updatElementValues);
				for(int k :collect1){
					O[k-1] = O[k-1]+1;
				}	
				
			}
			else if(collect1.size()>0||i==splitArrays.size()-1) {
			 Entry<Integer, Long> entry = collect1.stream()
					 .collect(
							 Collectors.groupingBy(val->val, Collectors.counting())
							 ).entrySet().stream().max(Map.Entry.comparingByValue()).get();
					
			System.out.println(collect1);
			System.out.println(entry);
			updatElementValues = updatElementValues+entry.getValue().intValue();
			}			 
			
		}
		System.out.println("FirstApp"+Arrays.toString(O));
		return O;
		
	}
	
	public List splitArrays(int[] A, int sepGreatThan) {
		List<int[]> arr = new ArrayList<>();
		int startPos =0;
		int endPos=0;
		
		for (int i=0;i<A.length;i++) {
			if(A[i]>sepGreatThan) {
				endPos=i;
				int n[] = Arrays.copyOfRange(A, startPos, endPos);
//				System.out.println(Arrays.toString(n));
				arr.add(n);
				startPos=i+1;
			}
			if(i==A.length-1 && startPos<A.length) {
				int n[] = Arrays.copyOfRange(A, startPos, A.length);
//				System.out.println(Arrays.toString(n));
				arr.add(n);
			}
		}
		return arr;
	}
	 
	

}
