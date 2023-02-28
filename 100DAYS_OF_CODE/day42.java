Day 42 coding Statement : Write Program to check if two arrays are the same or not

Description

Get two arrays as the input from the user and check whether it is the same or not.

Input

Enter the size of first array :

3

Enter the size of second array :

3

Enter elements of first array :

1 2 3

Enter elements of second array :

1 2 3

Output

Same



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    boolean flag=false;
	System.out.print("Enter the size of first array : ");
	int a=sc.nextInt();
	int [] arr= new int[a];
	System.out.print("Enter the size of second array : ");
	int b=sc.nextInt();
		int [] ar= new int[b];
   System.out.print("Enter elements of first array : ");
   for(int i=0;i<a;i++){
	arr[i]=sc.nextInt();
   }
	
	 System.out.print("Enter elements of second array : ");
   for(int i=0;i<b;i++){
	ar[i]=sc.nextInt();
   }
	if(a!=b){
	    System.out.print("Not Same");
	}else{
	for(int i=0;i<a;i++){
	   if( arr[i]!=ar[i]){
	       flag=true;
	       break;
	   }else{
	       flag=false;
	   }
	}
	
	if(flag==true){
	    System.out.print("Not Same");
	}
	else{
	    System.out.print("Same");
	}
	}
	}
}
