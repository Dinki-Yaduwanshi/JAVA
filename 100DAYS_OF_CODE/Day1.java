Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

Description of the program: 


Take an input character from the user and check whether the given input is a vowel or consonant.

Input

A

Output

Vowel

Input

m

Output

Consonant

Input

3

Output

Invalid Input

SOLUTION-

import java.util.Scanner;
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     char ch= sc.next().charAt(0);
     
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    	 System.out.print("Vowel");
     }else if ((ch>'A'&&ch<='Z')||(ch>'a'&&ch<='z')) {
    	 System.out.print("Consonant");
     }else {
    	 System.out.print("Invalid Input");
     }
	}

}
