import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	int n =8;
	int sum=0;
	while(num!=n){
	  sum+=num;
	  num = sc.nextInt();
	  
	}
	
	    System.out.print(sum+n);
	}
}
