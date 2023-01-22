Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie

Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

Input

10 20

Output

This point lies in first quadrant.

Input

-10 20

Output

This point lies in second quadrant.



import java.util.Scanner;
public class Main
{  
   
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    int y = sc.nextInt();
	    if(x>0&&y>0){
	        System.out.print("This point lies in first quadrant.");
	    }else if(x<0 && y>0){
	        System.out.print("This point lies in second quadrant.");
	    }
		
	}
}
