package com.rs.inheritence;

public class FibSeries {
	
	public static void main(String[] args) {
		FibSeries tc = new FibSeries();
		tc.iterativeFib(10);
		
		System.out.println();
		
		tc.recursiveFib(10);
		
//		int fibS = tc.recursiveFib(7);
//		System.out.println(fibS);

//		new TestClass().recurr(5);
//		System.out.println(new TestClass().fib(7, 'L'));
//		new TestClass().printFibSeries(5);

	}
	
	public int recurr(int a) {
		
		if(a-1 ==0) return 0;
		int b = recurr(a-1);
		System.out.println(a);
		return b;
	}
	
	public int fib(int N, char pos) {
		if (N== 0)return 0;
		if (N== 1)return 1;
		
//		int i = fib(N-1)+fib(N-2);
//		System.out.println(i);
		int val = fib(N-2,'L')+fib(N-1,'R');
		System.out.println(val+"-"+pos);
		return val;
	}
	
	public void printFibSeries(int N) {
		int i =0;
		int seriesNum=0;
		
//		int prev
		
		while (i<N) {
			seriesNum=seriesNum+i;
			System.out.println(seriesNum+i);
			i++;
			
		}
	}
	
	public void iterativeFib(int N) {
		int num1 = 0, num2 = 1;
		  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
	}
	
	public void recursiveFib(int N) {
		
		for (int i=0; i<N; i++) {
			System.out.print(recursiveFibFunction(i)+" ");
			
		}
	}
	
	public int recursiveFibFunction(int N) {
		if(N<= 1) return N;		
		return recursiveFibFunction(N-1)+recursiveFibFunction(N-2);		
		
	}

}
