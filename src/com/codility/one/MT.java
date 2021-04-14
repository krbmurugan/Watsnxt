package com.codility.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MT {
	
	public static void main(String[] args) {
		
		MT m = new MT();
		int[] A= new int[] {499,499,6,3,2,7,4,342, 121, 345,34,235,234,35,55,231,123,};
		int K = 3;
		int L = 2;
		int maxVal = m.solution(A, K, L);
		System.out.println(maxVal);
		
	}
	
	public int solution (int[] A, int K, int L) {
		System.out.println(Arrays.toString(A)+"=="+K+"=="+L);
		List<SubArrayData> kList = getSubArrayDataList(A, K,'K');
		List<SubArrayData> lList = getSubArrayDataList(A, L,'L');
		
		if (A.length<K+L) return -1;
		int max=0;
		Comparator<SubArrayData> sumSorterDesc = (ad1, ad2)->ad1.sumOfArrayelements<ad2.sumOfArrayelements?1:(ad1.sumOfArrayelements==ad2.sumOfArrayelements?0:-1);
		Comparator<SubArrayData> sumSorterAsc  = (ad1, ad2)->ad1.sumOfArrayelements>ad2.sumOfArrayelements?1:(ad1.sumOfArrayelements==ad2.sumOfArrayelements?0:-1);
		
		Comparator<SubArrayData> sumSorterAsc02 = (ad1, ad2)-> Integer.valueOf(ad1.getSumOfArrayelements()).compareTo(Integer.valueOf(ad2.getSumOfArrayelements()));
		
		
		kList.sort(sumSorterAsc02);
		System.out.println("mmm"+kList);
		
		for (SubArrayData k : kList) {
			for(SubArrayData l : lList) {
				if(k.endPos<l.StartPos) {
					int s = k.sumOfArrayelements+l.sumOfArrayelements;
					max = max>s? max:s;
				}
			}
		}
		return max;
	}
	
	public List<SubArrayData> getSubArrayDataList(int[] A, int size, char arrName){
		int startPos =0;
		int endPos=size-1;
		
		List<SubArrayData> subArrData = new ArrayList();
		for (int i=startPos; i<=A.length-size;i++, startPos++, endPos++) {
			int n[] = Arrays.copyOfRange(A, startPos, endPos+1);
			int subArrsum = Arrays.stream(n).sum();
			
//			System.out.println(arrName+"=="+startPos+","+endPos+"=="+subArrsum);
			subArrData.add(new SubArrayData(arrName, startPos, endPos,subArrsum ));			
		}
		
		
		return subArrData;
		
	}
	
	class SubArrayData implements Comparable{
		char arrayName;
		


		int StartPos=0;
		int endPos=0;
		int sumOfArrayelements=0;
		public SubArrayData(char arrayName, int startPos, int endPos, int sumOfArrayelements) {
			super();
			this.arrayName = arrayName;
			StartPos = startPos;
			this.endPos = endPos;
			this.sumOfArrayelements = sumOfArrayelements;
		}
		
 
	    public int compareTo(SubArrayData sumOfArrayelements) {
	        int compareSumOfArrayelements=((SubArrayData)sumOfArrayelements).sumOfArrayelements;
	        /* For Ascending order*/
//	        return this.sumOfArrayelements-sumOfArrayelements;

	        /* For Descending order do like this */
	        return compareSumOfArrayelements-this.sumOfArrayelements;
	    }
		
		@Override
		public String toString() {
			return "SubArrayData [arrayName=" + arrayName + ", StartPos=" + StartPos + ", endPos=" + endPos
					+ ", sumOfArrayelements=" + sumOfArrayelements + "]";
		}


		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public char getArrayName() {
			return arrayName;
		}


		public void setArrayName(char arrayName) {
			this.arrayName = arrayName;
		}


		public int getStartPos() {
			return StartPos;
		}


		public void setStartPos(int startPos) {
			StartPos = startPos;
		}


		public int getEndPos() {
			return endPos;
		}


		public void setEndPos(int endPos) {
			this.endPos = endPos;
		}


		public int getSumOfArrayelements() {
			return sumOfArrayelements;
		}


		public void setSumOfArrayelements(int sumOfArrayelements) {
			this.sumOfArrayelements = sumOfArrayelements;
		}
		 
		
	}

}
