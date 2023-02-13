Day 25 coding Statement : Write a program to find Area of a circle

Description

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius

Input

3

Output

28.26






import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    float a =sc.nextInt();
	    float p=(float)3.14*a*a;
	    System.out.print(p);
	    
	}
}
