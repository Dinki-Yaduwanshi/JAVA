
Day 41 coding Statement : Check if two strings match where one string contains wildcard characters

Description

Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.

Then check whether they match or not.

Input

Ta**nt

Talent

Output

Yes they match

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	String h=sc.next();
	boolean flag=true;
   for(int i=0;i<s.length();i++){
      if( s.charAt(i)==h.charAt(i)){
          continue;
      }else if( s.charAt(i)=='*'||s.charAt(i)=='?'){
          continue;
      }else{
          flag=false;
      }
       
   }
   if(flag==false){
       System.out.print("No they don't match");
   }else{
       System.out.print("Yes they match");
   }
  
	}
}
