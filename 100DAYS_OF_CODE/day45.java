Day 45 coding Statement : Write Program to find smallest and largest element in an array

Description

Get an array as input from the user and then find the smallest and largest element in the array.

Input

Enter the size of array :

5

Enter the elements :

10 20 5 40 30

Output

Smallest Number :

5

Largest Number :

40


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr= new int[a];
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE; 
		int min=Integer.MAX_VALUE;
	for(int j=0;j<arr.length;j++){
	   if(max<arr[j]){
	       max=arr[j];
	   }
	   
	   if(min>arr[j]){
	       min=arr[j];
	   }
	}
		System.out.println("Smallest Number : ");
	System.out.println(min);
	
		System.out.println("Largest Number : ");
	System.out.println(max);
	
	}
}
