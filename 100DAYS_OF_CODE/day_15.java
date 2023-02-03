Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

Input

121

Output

Not a strong number

Input

2

Output

Strong number

SOLUTION:

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
	    int fact=1;
	    int sum=0;
		while(n>0) {
			int rem=n%10;
			for(int i=rem;i>0;i--) {
				fact*=i;
			}
			sum+=fact;
			fact=1;
			n=n/10;
		}
		
		if(num==sum) {
		System.out.print("Strong number");
		}else {
			System.out.print("Not a strong number");
		}
	}

}

