package com.cci.c01ArrayAndStrings;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author P2812865
 * Method to decide if one string is a permutation of the other string
 * Consider if there string needs to be considered as case sensitive 
 * and if Space character needs to be considered
 */
public class CheckStringPermutOfAnotherString {
	
	private static Logger LOG = LoggerFactory.getLogger(CheckStringPermutOfAnotherString.class);
	public static void main(String[] args) {
		
		CheckStringPermutOfAnotherString csp = new CheckStringPermutOfAnotherString();
		
		String s1 = "tisac";
		String s2 = "scita";
		boolean isPermutation = csp.isPermuation(s1, s2);
		
		LOG.info("isPermutation", isPermutation);
	}
	
	public boolean isPermuation(String s1, String s2) {
		
		if(s1.length()!=s2.length()) return false;
		char[] s1char = s1.toCharArray();
		char[] s2char = s2.toCharArray();
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		System.out.println(s1char);
		System.out.println(s2char);
		return Arrays.equals(s1char, s2char);
	}

}
