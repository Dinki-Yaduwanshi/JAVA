Day 9 coding Statement : Write a program to find Number of digits in an integer

Description

Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.

Input

3241

Output

4

Input

6

Output

1


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	 int count=0;
	
	while(num!=0){
	    num=num/10;
	    ++count;
	}
	
	System.out.print(count);
	}
}
