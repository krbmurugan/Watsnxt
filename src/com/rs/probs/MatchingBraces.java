package com.rs.probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class MatchingBraces {
	
	
	private HashMap<String, String> matchingBraces;	
	private ArrayList<String> openBraces = new ArrayList<String>();
	private ArrayList<String> closeBraces = new ArrayList<String>();

	public void setVariables() {
		matchingBraces = new HashMap<String, String>();
		matchingBraces.put("]", "[");
		matchingBraces.put("}", "{");
		matchingBraces.put(")", "(");
		
		openBraces.add("(");
		openBraces.add("{");
		openBraces.add("[");
		
		closeBraces.add(")");
		closeBraces.add("}");
		closeBraces.add("]");
	}
	
	public boolean isMatchingBrace(String closeBrace, String peekedBrace) {
		if (matchingBraces.get(closeBrace).equals(peekedBrace)) return true;
		return false;
	}
	
	public boolean isOpenBrace(String s) {
		if (openBraces.contains(s)) return true;
		return false;
	}
	
	public static void main(String[] args) {
		String in ="{{}}[](){}";
		System.out.println(in);
		MatchingBraces mb = new MatchingBraces();
		mb.setVariables();
		Stack stk = new Stack();
		boolean isMatching=true;
		
		for (char c: in.toCharArray()) {
			String tmp = new String(""+c);
			if(mb.isOpenBrace(tmp))	stk.push(tmp);
			else if (stk.size()!=0 && mb.isMatchingBrace(tmp, (String)stk.peek() )) stk.pop();
			else isMatching = false;			
		}
		
		if(stk.size()>0) isMatching = false;
		System.out.println("isMatching.."+isMatching);
		
	}

}
