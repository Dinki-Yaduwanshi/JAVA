way 1:

public class Main
{
	public static void main(String[] args) {
	int[] a={3,5,4,3,2,2,1};
	
	//brute force
	
	for(int i =0;i<a.length-1;i++){
	    for(int j =i+1;j<a.length;j++){
	        if(a[i]==a[j] && i!=j){
	            
	            System.out.print(a[j]+" ");
	        }
	    }
	}
	         }
	   }

*******************************************************************************
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int[] a={3,5,4,3,2,2,1};
	
	Set<Integer> s= new HashSet<>();
	for(int i :a){
	    if(s.add(i)==false){
	    System.out.print(i+" ");
	        
	    }
	}

                } 
            }

*******************************************************************************
package com.java.array;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,5,6,7,2,4,6};
      Map<Integer,Integer> hm = new HashMap();
      for(int no:a) {
    	  Integer count=hm.get(no);
    	  if(count==null) {
    		  hm.put(no,1);
    	  }else {
    		  count++;
    		  hm.put(no, count);
    	  }
      }
      
      Set<Map.Entry<Integer,Integer>> e= hm.entrySet();
      
      for(Map.Entry<Integer, Integer> h:e) {
    	  if(h.getValue()>1) {
    		  System.out.print(h.getKey()+" ");
    	  }
      }
      
      
	}

}

