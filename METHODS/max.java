package com.java.method;

/**
 * @author 76din
 *
 */
public class Methodpractice {

static	int max(int x,int y) {
	x=x+20;
		if(x>y) {
			return x;
			}
		else {return y;}
		
	}
	public static void main(String[] args) {
		int a=10,b=15,c;
		c=max(a,b);
		System.out.println(c +" "+ a);//a does not get affected as it is actual parameter which is different from the formal parameter

	}

}
