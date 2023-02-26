Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.

Input

sunlight thgiluns

Output

Anagram






import java.util.Scanner;
import java.util.Arrays;

public class Main{

public static boolean isAnagram(String str1 , String str2){
    	if(str1.length()!=str2.length()){
    	    return false;
    	}
    	
 char[] str3=str1.toCharArray();
   Arrays.sort(str3);
 char[] str4=str2.toCharArray();
  Arrays.sort(str4);
  
  for(int i=0;i<str3.length;i++){
      if(str3[i]!=str4[i]){
          return false;
      }
  }
  
  return true;
}
    

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1= sc.next();
	String str2=sc.next();
	
	if(isAnagram(str1,str2)){
	  System.out.print("Anangram");  
	}else{
	    System.out.print("Not Anangram"); 
	}

  
  
	}
}
