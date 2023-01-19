
Get an input character from the user and give the ASCII value of the given input as the output.

Input:

b

Output:

98

Input:

B

Output:

66

  SOLUTION:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isLetter(c)){
		int a = (int)c;
		System.out.print(a);}
		else{
		 System.out.print("Enter valid character");   
		}
	}
}
