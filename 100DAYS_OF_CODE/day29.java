Day 29 coding Statement : Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.

Input

Enter first string

Hello

Enter second string

Hi

Output

HelloHi



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String str1= sc.next();
	String str2=sc.next();
	
	System.out.print(str1.concat(str2));
	}
}
