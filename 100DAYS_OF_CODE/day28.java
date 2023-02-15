Day 28 coding Statement : Write a Program to reverse a string.

Description

Get an input string from user and print it in reverse order.

Input

Hello

Output

olleH





import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str=sc.next();
String str1="";
for(int i=str.length()-1;i>=0;i--){
 str1=str1+str.charAt(i);
}
System.out.print(str1);
}
}
