import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] arr ={2,0,8,0,6,1};
		int n=arr.length;
		int count=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]!=0){
		      arr[count]=arr[i];
		      count++;
		    }
		        }
       for(int i=0;i<arr.length;i++){
       if ( i>=count)
           arr[i]=0;
           
           
           System.out.print(arr[i]+" ");
       }

       
		
	
	}
}
