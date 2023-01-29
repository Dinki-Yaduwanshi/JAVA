Day 11 coding Statement:  Write a program to find Fibonacci series up to n

Description

Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.

Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

Input

5

Output

0,1,1,2,3

Input

8

Output

0,1,1,2,3,5,8,13

SOLUTION:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
	    int n1=0,n2=1;
	    System.out.print(n1+ ",");
	      System.out.print(n2);
		for(int i=2;i<a;i++){
		 int n3=n1+n2;
		    System.out.print(","+n3);
		    n1=n2;
		    n2=n3;
		}
	}
}
