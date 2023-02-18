
Day 31 coding Statement : Write a Program to Toggle each character in a string

Description

Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input

Hello

Output

hELLO





import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String str1= sc.next();
	char[] c=str1.toCharArray();
    int count=0;
    for(char ch:c){
    if(ch==Character.toUpperCase(ch)){
        ch=Character.toLowerCase(ch);
    }else{
        ch=Character.toUpperCase(ch);
    }
    System.out.print(ch);
	}
	
}
}
