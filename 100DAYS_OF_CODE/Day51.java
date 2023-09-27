import java.util.*;
import java.util.Map.Entry;
public class Frequencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {23,4,56,56,4,3,2,4};
      
     for(int i=0;i<arr.length;i++) {
    	  boolean flag = false;
    	  for(int j=0;j<i;j++) {
    		  if(arr[i]==arr[j]) {
    			  flag=true;
    			  break;
    		  }
    	  }
    	  
    	  if(flag==true)
    		  continue;
    	  int freq=1;
    	  for(int j=i+1;j<arr.length;j++) {
    		  
    		  if(arr[i]==arr[j]) {
    			  freq++;
    		  }
    	  }
    	  System.out.println(arr[i]+" "+freq);
      }
      
      
      HashMap<Integer, Integer> hs= new HashMap<>();
      for(int i =0;i<arr.length;i++) {
    	  if(!hs.containsKey(arr[i])) {
    		  int count= hs.getOrDefault(arr[i],1);
    	      hs.put(arr[i], count+1);
      }
	}
      
     for( Map.Entry<Integer, Integer> hm : hs.entrySet()
   
    )	  System.out.println(hm.getKey()+" "+hm.getValue());
      }
	}

