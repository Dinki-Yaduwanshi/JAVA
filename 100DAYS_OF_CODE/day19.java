Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number

Input

153

Output

Armstrong number

Input

121

Output

Not an Armstrong number 







import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		int mat=num;
		int res=num;
		int rem=0; int sum=0; int count=0;
		while(num!=0){
		   rem=num%10;
		   count++;
		   num=num/10;
		}
		rem=0;

        while(mat!=0){
            rem=mat%10;
            sum+=(int)Math.pow(rem,count);
            mat=mat/10;
        }
        
        
		if(sum==res){
		    System.out.print("Armstrong number");
		}else{
		     System.out.print("Not an Armstrong number");
		}
	}
}
