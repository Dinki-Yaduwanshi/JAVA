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


