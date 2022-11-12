

import java.util.*;

public class PuctuationCounter {
 public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
     char a ='i';
     int count=0;
	          for(int i=0;i<str.length();i++) {
		       
	  if(str.charAt(i)==('!')||str.charAt(i)==('.')||str.charAt(i)==('?')||str.charAt(i)==('\"')||str.charAt(i)==('\'')||str.charAt(i)==(';')) 
		       {
		  count=count+1;
		      }
	 
		
	          }
	      System.out.println("The number of punctuations exsts in the string is: " +count); 
 }
	
	
	
	
}
