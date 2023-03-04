
Day 43 coding Statement : Write Program to find the array type

Description

Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input

Enter size of array :

3

Enter elements 

1 3 5

Output

Odd



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
		
		if(e==0&&o>0){
		    System.out.print("Odd");
		}else	if(o==0&&e>0){
		    System.out.print("Even");
		}else{
		    System.out.print("Mixed");
		}
		
		
	}
}
