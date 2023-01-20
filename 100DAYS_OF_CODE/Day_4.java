Day 4 coding Statement:  Write a program to identify of the a number is positive or negative

Description

Get an input number from the user and check whether it is a positive or negative number.

Input :

-10

Output : 

Negative number

Input :

0

Output :

Neither positive nor negative

Input :

15

Output : 

Positive number

SOLUTION:
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		
		if(a<0){
		    System.out.print("Negative number");
		}else if(a==0){
		     System.out.print("Neither positive nor negative");
		}else {
		    System.out.print("Positive number");
		}
	}
}
