Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function

Description

Get a string as input from user and print the length of the string without using strlen() function.

Input

Hello

Output

5

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String str1= sc.next();
	char[] c=str1.toCharArray();
    int count=0;
    for(char ch:c){
    count++;
	}
	
	System.out.print(count);
}
}
