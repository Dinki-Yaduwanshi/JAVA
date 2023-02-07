Day 20 coding Statement : Write a program to identify if the number is Prime number or not

Description

Get a number as input from the user and check whether that number is prime or not.

A prime number is a number with factors as 1 and that number itself.

Input

1

Output

1 is not a prime number

Input

5

Output

5 is a prime number  



import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=false;
		
		if(num==1){
		    flag=true;
		}
		
		for(int i=2;i<num;i++){
		    if(num%i==0 ){
		       flag=true;
		        break;
		     }   
		}
		
		if(flag==true){
		    System.out.print( num+ " is not a prime number"); 
		}else{
		        System.out.print(num+ " is a prime Number");
		    
		}
}
}
