Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.

Input

310020

Output

311121


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String n =sc.next();
		n=n.replace('0','1');
		
		System.out.print(n);
		
	}
}
