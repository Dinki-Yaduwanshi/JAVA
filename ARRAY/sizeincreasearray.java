package com.java.array;

public class sizeincreasearray {

	public static void main(String[] args) {
		int A[]= {2,4,5,6,7};
		System.out.print(A.length);
		int B[]=new int[2*A.length];
		System.out.println();
		for(int i=0;i<A.length;i++) {
			B[i]=A[i];
		}
		 A=B;
		 B=null;
		 {System.out.print(A.length);}
		 
	}
    
}
