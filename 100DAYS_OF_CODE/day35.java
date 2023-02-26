Day 35 coding Statement : Write a Program to Count the sum of numbers in a string

Description

Get a string from the user and find the sum of numbers in the string.

Input

Hello56

Output

11



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String n= sc.next();
	int sum=0;
	for(int i =0;i<n.length();i++){
	    char a= n.charAt(i);
	    if(Character.isDigit(a)){
	       //sum=sum+Character.getNumericValue(a);
	        sum=sum+(a-'0');
	    }
	}
	System.out.print(sum);
	
	}
}
