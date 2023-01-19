Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.

Input :

A

Output: 

Alphabet

Input:

7

Output:

Not an alphabet

SOLUTION


import java.util.Scanner;
public class Day2 {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
   char c=sc.next().charAt(0);
    if((c>='A'&&c<='Z')||(c>='a'&& c<='z')){
    System.out.print("Alphabet");
     }
    else {
    	 System.out.print(" Not an alphabet");
     }
		
	}
