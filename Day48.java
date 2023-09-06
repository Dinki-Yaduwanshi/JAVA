import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
    int first=0;
    int sec=1;
   
    
    for(int i=0;i<num;i++){
        System.out.println(first);
        
       int next= first+sec;
       first=sec;
       sec=next;
 
    }
	 
	}
}
