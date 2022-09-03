package com.java.method;
import java.util.Scanner;
public class isPrime {
static boolean isPrime(int n){
	boolean b=true;
	
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) { 
		b=false;}
		else {
			b=true;
			}
	}
	System.out.print(b);
	return b;

	}

	public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		isPrime(x);

	}

}
