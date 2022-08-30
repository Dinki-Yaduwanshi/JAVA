package com.array.one;

public class Array2D {

	public static void main(String args[]) {
		
		int A[][]= {{1,2,3,4},{4,6,5,7},{6,7,4,7}};
		
		for(int i=0;i<A.length;i++) {
			
			for(int j=0;j<A[0].length;j++) {
				System.out.print(A[i][j]);
			}
			System.out.print("\n");
		}
		
	System.out.println( " \n for each loop");
	
	for(int x[]:A) {
		for(int y:x) {
			System.out.print(y);
		}
		System.out.print("\n");
	}
		
		
		
	}
}
