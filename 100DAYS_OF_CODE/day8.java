Day 8 coding Statement:  Write a program to find roots of a quadratic equation

Description

Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.

Input

Enter the value of a, b and c : 1 -6 9

Output

Roots are equal

Root 1= root 2 = 3.00



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  double a=sc.nextDouble();
	  
	  double b = sc.nextDouble();
	  double c=sc.nextDouble();
	  
	  double disc=Math.pow(b,2)-4*a*c;
	  Double root1=0.0;
	  Double root2=0.0;
	  
	  if(disc>0){
	    System.out.println("Roots are real and distinct");
	    System.out.print("root1"+(-b+ Math.sqrt(disc))/(2*a) + "root2"+ (-b- Math.sqrt(disc)/(2*a)));
	    
	
	  }
	  else 
	  if(disc==0){
	    System.out.println("Roots are equal");   
	    System.out.print("root1 = root2 "+ -b/(2*a));
	  }else
	  
	  {
	       System.out.println("Roots are complex");
	       System.out.print("root1" +-b/(2*a)+"i"+ Math.sqrt(-disc)/(2*a)+"and"+-b/(2*a)+"-i"+ Math.sqrt(-disc)/(2*a));
	  }
	  
	  
	 
	  }
	}
