public class Main
{
	public static void main(String[] args) {
	int a =8 , b= 10;
	int hcf=0 , lcm=0;
	
	for(int i=1;i<=8 && i<=b; i++){
	    if(a%i==0 && b%i==0){
	       hcf=i; 
	    }
	}
	
	lcm= (a*b)/hcf;
	
	System.out.print(hcf +" "+lcm);
	}
}
