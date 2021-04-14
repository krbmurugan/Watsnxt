package com.codility.one;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoizationTest {
	Map<Integer, Integer> cache = new ConcurrentHashMap<>();
	
	public static void main(String[] args) {
		

		
	}
	
	public Integer doubleValue(Integer x) {
		  return cache.computeIfAbsent(x, y -> y * 2);
		}


}
