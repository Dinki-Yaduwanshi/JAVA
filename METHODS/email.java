package com.java.method;

public class email {
 static	 String username(String email) {
		 int a =email.indexOf("@");
		 String name=email.substring(0, a);
		 return name;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = "suneel@gamil.com";
    System.out.print(username(s));
   
	   
   }
	}
