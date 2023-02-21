Day 32 coding Statement : Write a Program to Remove vowels from a string

Description

Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input

remove

Output

rmv


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String n= sc.next();
	String h="";
	for(int i=0;i<n.length();i++){
	    char a=n.charAt(i);
	    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
	        continue;
	    }else{
	        h = h +String.valueOf(a);
	    }
	}
  System.out.print(h);
	}
}
