package com.cci.c01ArrayAndString;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cci.c01ArrayAndStrings.CheckStringPermutOfAnotherString;

public class CheckStringPermutOfAnotherStringTest {
	
	private CheckStringPermutOfAnotherString cspas;
	@BeforeEach
	public void setUp() {
		System.out.println("setting up");
		cspas = new CheckStringPermutOfAnotherString();	
		
	}
	
	@Test
	@DisplayName("Test if string is a permutation")
	public void testIsPermutation() {
		assertTrue(cspas.isPermuation("tisac", "tiasc"));
		assertFalse(cspas.isPermuation("tisac", "tiascq"));
		
	}
	
	@Test
	@DisplayName("Test another")
	public void anotherTest() {
		assertTrue(true);
		assertFalse(cspas.isPermuation("asdf", "sd"));
		
	}
	

}
