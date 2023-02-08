Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input

121

Output

Palindrome

Input

34

Output

Not a Palindrome



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
     	int num=sc.nextInt();
     	int n =num;
     	int rem=0, rev=0;
     	
     	while(num!=0){
     	    rem=num%10;
     	    rev=rev*10+rem;
     	    num=num/10;
     	}
     	
     	if(rev==n){
     	    System.out.print("Palindrome");
     	}else{
     	    System.out.print("Not a Palindrome");
     	}
	}
}
