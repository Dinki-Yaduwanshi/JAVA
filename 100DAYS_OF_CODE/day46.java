Day 46 coding Statement : Write Program to find sum of elements in an array.

Description

Get an array as the input from the user and find the sum of the elements.

Input

Enter the size of array

3

Enter the elements of array

5 10 15

Output

30



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
		int max=0;  
	for(int j=0;j<arr.length;j++){
	    max+=arr[j];
	}
	System.out.println(max);
	
	}
}
