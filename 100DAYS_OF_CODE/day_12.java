Day 12 coding Statement:  Write a program to find Sum of digits of a number

Description

Get a number from user and then find the sum of the digits in the given number.

E.g. let the number = 341

Sum of digits is 3+4+1= 8

Input

4521

Output

12

SOLUTION:


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int rem=0;
	   while(a!=0){
	       rem=a%10;
	       sum+=rem;
	       a=a/10;
	   }
	    
		System.out.print(sum);
	}
}
