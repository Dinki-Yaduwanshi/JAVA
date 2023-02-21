Day 33 coding Statement : Write a Program to check if String is a palindrome or not

Description

Get an input string from the user and then check whether it is a palindrome string or not.

Input

noon

Output

Palindrome

Input

Talent

Output

Not a Palindrome

 



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String n= sc.next();
	int i=0,j=n.length()-1;
	
	while(i<j){
	    char a=n.charAt(0);
	    char l=n.charAt(j);
	    if(a!=l){
	        System.out.print("Not a Palindrome");
	        break;
	    }else{
	        i++;
	        j--;
	    }
	    	System.out.print("Palindrome");
	    	break;
	    
	}
	

	}
}
