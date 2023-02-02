Day 14 coding Statement : Write a program to reverse a given number

Description

Get an input from the user and the print the reverse of the given number as the output

E.g. let the number be 324 then the reverse of the number is 423

Input

675

Output

576



import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String rev="";
		while(n>0) {
			int rem=n%10;
			
			rev+=rem;
			n=n/10;
		}
		System.out.print(rev);
	}

}
