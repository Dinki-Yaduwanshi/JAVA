Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

Input

2  3

4  3

Output

2/1   
  
  
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		
		int x3=(a*d)+(b*c);
		int y3=b*d;
		
		int div=0;
		if(x3>y3){
		div=x3;
		}
		else{
		div=y3;
		}
		
		for(int i=div;i>0;i--){ 
		if(x3%i===0 && y3%i==0){
		x3=x3/i;
	        y3=y3/i;
		}
			}
		
		
		System.out.print(x3+"/"+y3);
		
	}
}
