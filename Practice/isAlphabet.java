Write a program to identify if the character is an alphabet or not.

Description: Take an input character from user and check whether it is an alphabet or not.

Input : A

Output:  Alphabet

Input: 7

Output: Not an alphabet


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  char ch=sc.next().charAt(0);
	  if((ch>'a'&& ch<'z')||(ch>'A'&&ch<'Z')){
	      System.out.print(ch +"Alphabet");
	  }else
	  {System.out.print(" Not an alphabet");}
	 
}
}
