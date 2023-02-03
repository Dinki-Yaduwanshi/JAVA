Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

Description

Get the input from the user and check whether that number is a perfect number or not.

E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.

Input

28

Output

Perfect Number

Input

4

Output

Not a perfect number

SOLUTION:


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int fact=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
              fact+=i; 
            }
             }
             if(fact==a){
        System.out.print("Perfect Number");
                 
             }else{
                System.out.print("Not a perfect number"); 
             }
	}
}
