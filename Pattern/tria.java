
//
package com.java.pattern;

 class Trialeft {

	public static void main(String[] args) {
		
		int n =6;
      for(int i =0;i<=6;i++) {
	 
   	  for(int j=2*(n-i);j>=0 ;j--) {
    		  System.out.print(" ");
    	  }
    	  
   	  for(int j=0;j<=i;j++) {
    		  System.out.print( " *");
    	  }
   	  System.out.println();
	
     }
	}

	 
	 
//	 public static void main(String args[])   
//	 {    
i for rows and j for columns      
	 //row denotes the number of rows you want to print  
	 int i, j, row = 7;       
	 //Outer loop work for rows  
	 for (i=0; i<row; i++)   
	 {  
	 //inner loop work for space      
	 for (j=2*(row-i); j>=0; j--)         
	 {  
	 //prints space between two stars      
	 System.out.print(" ");   
	 }   
	 //inner loop for columns  
	 for (j=0; j<=i; j++ )   
	 {   
	 //prints star      
	 System.out.print("* ");   
	 }   
	 //throws the cursor in a new line after printing each line  
	 System.out.println();   
	 }   
	 }    
	 
