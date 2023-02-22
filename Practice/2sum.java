import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] arr ={2,4,3,5,6,1};
		
		int n =5;
		boolean f=true;
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]+arr[j]==n){
		            System.out.println(i+" "+j);
		            break;
		        }
		        else{
		            f=false;
		            
		        }
		    }
		}
		
		if(f==false){
		    System.out.print("not any");
		}
	}
}
