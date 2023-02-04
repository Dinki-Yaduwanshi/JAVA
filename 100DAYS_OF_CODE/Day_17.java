Day 17 coding Statement : Write a program to find the Factors of a number

Description

Get an input from the user and find the factors of the number.

Input

4

Output

1,2,4 



SOLUTION-

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		for (int i =1;i<a;i++){
		    if(a%i==0){
		        System.out.print(i +",");
		    }
		    
		}
		System.out.print(a);
	}
}
