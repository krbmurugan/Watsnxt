package com.codility.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class IntToBinary {
	public static void main(String[] args) {
		int i =64;
		String binaryString = Integer.toBinaryString(i);
		System.out.println(binaryString);
		
		int q =i;
		int rem = 0;
		int gapLen = 0;
		List<Integer> gapList = new ArrayList<>();
		StringBuffer strBuf = new StringBuffer();
		
		while(q!=0) {
			if(q%2==0)++gapLen;
			if(q%2==1) {
				if(q>0)gapList.add(gapLen);
				gapLen=0;
			}
			
			strBuf.append(q%2);
			q=q/2;
		}
		
		System.out.println(strBuf.reverse());
		System.out.println("binaryvalue=="+gapList);
//		gapList = gapList.subList(1, gapList.size());
//		System.out.println(gapList);
		
		if(gapList.size()>1) {
		System.out.println(Collections.max(gapList.subList(1, gapList.size())));}
		else
		{
			System.out.println(0);
		}
		
		
		
		
	}

}
