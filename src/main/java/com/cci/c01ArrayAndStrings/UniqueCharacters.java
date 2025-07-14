package com.cci.c01ArrayAndStrings;

public class UniqueCharacters {
	
	public static void main(String[] args) {
//		String s="CrackingCodingInterview 2021.,/;[]{}";
		String s="ABCDEFGHIJKLA";
		boolean isUni = new UniqueCharacters().isUnique(s);
		System.out.println(isUni);
		
/*		for (int i =0; i<s.length();i++) {
			int charInt = s.charAt(i);
			System.out.println(s.charAt(i)+"=="+charInt);
			
		}*/
	}
	
	private boolean isUnique(String s) {
		if(s.length()>128) return false;
		boolean[] chars = new boolean[128];
		for (int i=0; i<s.length();i++) {
			int charInt = s.charAt(i);
			if(chars[charInt]) return false;
			else chars[charInt]=true;
		}
		System.out.println(
			"test"
		);

		System.out.println("This will be another change..");
		
		return true;
	}

}
