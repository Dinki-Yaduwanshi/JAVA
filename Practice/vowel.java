import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  char ch=sc.next().charAt(0);
	  
	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	      System.out.print("vowel");
	  }else if((ch>'a'&&ch<'z')||(ch>'A'&&ch<'Z')){
	      System.out.print("consonent");
	  }else
	 
	  { System.out.print("invalid");
	}
}
}
