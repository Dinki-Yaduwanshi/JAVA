Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string

Description

Get a string from the user and then change the first and last letter to uppercase.

Input

programming

Output

ProgramminG


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s=sc.next();
	String f="";
	for(int i=0;i<s.length();i++){
	    char h=s.charAt(i);
	    if(i==0||i==s.length()-1){
	        h=Character.toUpperCase(h);
	        f=f+Character.toString(h);
	    }else{
	         f=f+Character.toString(h);
	    }
	}
	
	System.out.print(f);
	}
}
