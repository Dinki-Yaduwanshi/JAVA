
Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression

Description

Get an algebraic expression as input from the user and then remove all the brackets in that.

Input

7x+(2*y)

Output

7x+2*y


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String n= sc.next();
	String h="";
	for(int i =0;i<n.length();i++){
	    char a= n.charAt(i);
	    if(a=='('||a==')'){
	      continue;
	    }else{
	     h+=String.valueOf(a);   
	    }
	}
	System.out.print(h);
	
	}
}
