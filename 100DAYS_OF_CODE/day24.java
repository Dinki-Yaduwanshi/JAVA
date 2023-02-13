Day 24 coding Statement : Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input

4

Output

  *

 ***

*****

*******







import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
		    for(int j=1;j<=(i*2)+1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
