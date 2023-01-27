Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input

4

Output

24


SOLUTION

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int fact=1;
		for(int i =a;i>0;i--){
		    fact=fact*i;
		}
		
		System.out.print(fact);
	}
}
