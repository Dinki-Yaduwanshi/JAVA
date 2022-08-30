package com.java.array;

public class ArrayRotation {

	
		public static void main(String[] args) {
			int A[]={1,2,3,4,5,6};
			
			for(int x :A) {
				System.out.print(x);
			}
			int temp=A[0];
			System.out.println("After rotation :");
			for(int i =0;i<A.length-1;i++) {
				A[i]=A[i+1];
				
				}
			A[A.length-1]=temp;
			
			for(int i =0;i<A.length;i++) {
				System.out.print(A[i]+" ");
			}
			//rotation left
			 
		//right rotation
			
		}
}

