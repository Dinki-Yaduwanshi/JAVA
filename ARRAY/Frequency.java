package com.array.one;

public class practice {

	public static void main(String[] args) {
	
		//frequency of elements
		
		int[] a= {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int[] b=new int[a.length];
		int visited=-1;
		
		for(int i =0;i<a.length;i++) {
			int count=1;
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;
			
				}
				if(b[i]!=visited) {
					b[i]=count;
				}
			}
		}
		
		System.out.println(" Element     | Frequency ");
		for(int i =0;i<b.length;i++) {
			if(b[i]!=visited)
			System.out.println(a[i]+" "+b[i]);
		}
	}
		
	}
