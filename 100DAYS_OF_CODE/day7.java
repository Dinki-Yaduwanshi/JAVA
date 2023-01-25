Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.

Input

Enter month : 2

Enter year : 2000

Output

29

SOLUTION

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter month:");
	  int a=sc.nextInt();
	  System.out.print("Enter year:");
	  int b = sc.nextInt();
	  
	  if(a==1||a==3||a==5||a==7||a==9||a==11){
	      System.out.print(31);}
	      else if(a==2){
	          if((b%400==0)||(b%4==0)&&(b%100==0)){
	              System.out.print(29);
	          }else{
	              System.out.print(28);
	          }
	      }
	      else{
	          System.out.print(30);
	      }
	  }
	}
