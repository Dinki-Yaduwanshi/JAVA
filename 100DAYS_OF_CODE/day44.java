Day 44 coding Statement : Write Program to find number of even and odd elements in an array

Description

Get an array as input from the user and then count the number of even and odd elements present in the array.

Input

Enter size of array

4

Enter the elements :

1 3 4 5

Output

Number of even elements :

1

Number of odd elements :

3

 



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
		int e=0,o=0;
     	for(int i=0;i<a;i++){
		   if(arr[i]%2==0){
		      e++; 
		   }
		   else if(arr[i]%2==1){
		      o++;
		   }
		  
		}
		
	System.out.println("Number of even elements : ");
		System.out.println(e);
		
				
	System.out.println("Number of odd elements : ");
		System.out.println(o);
	}
}
