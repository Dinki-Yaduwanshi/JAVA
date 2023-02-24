Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string

Description

Get a string as the input from the user and find the frequency of characters in the string.

Input

program

Output

The frequency of a is 1

The frequency of g is 1

The frequency of m is 1

The frequency of o is 1

The frequency of p is 1

The frequency of r is 2






import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s =sc.next();
		int count=0;
		char c;
		for(int i=0;i<s.length();i++){
		     c=s.charAt(i);
		    for(int j=0;j<s.length();j++){
		        if(c==s.charAt(j)){
		        count++;
		            
		        }
		    }
		    System.out.println("The frequency of "+ c +" is "+count);
		    count=0;
		}
	}
}
__________________________________________________________________________________________________________________________________________________________________________



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s =sc.next();
		HashMap<Character,Integer> hm= new HashMap<>();
		int count=0;
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		   
		     if(hm.containsKey(c)){
		         hm.put(c,hm.get(c)+1);
		     }else{
		         hm.put(c,1);
		     }
		     
		}
		
		for(char c:hm.keySet()){
		    System.out.println("The frequency of "+ c + " is "+ hm.get(c));
		}
		
		
	}
}
