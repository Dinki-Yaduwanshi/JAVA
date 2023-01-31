INPUT:
STRING:Rajeev
STRING:Roy
PINCODE:425968
Int n:5




import java.util.Scanner;
public class Prob1 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		int pincode=sc.nextInt();
		String p=String.valueOf(pincode);
		int n =sc.nextInt();
		String res="";
		if(first.length()>second.length()) {
			char ch=second.charAt(0);
			res+=ch;
			res=res.toLowerCase();
			String se=first.toUpperCase();
			res+=se;
		}else if(first.length()<second.length()) {
			char ch=first.charAt(0);
			res+=ch;
			res=res.toLowerCase();
			String se=second.toUpperCase();
			res+=se;
		}else {
			if(second.compareTo(first)>0) {
				char ch=first.charAt(0);
				res+=ch;
				res=res.toLowerCase();
				String se=second.toUpperCase();
				res+=se;
			}else {
				char ch=second.charAt(0);
				res+=ch;
				res=res.toLowerCase();
				String se=first.toUpperCase();
				res+=se;
			}
		}
		
		String c=""+p.charAt(n)+p.charAt(p.length()-n-1);

		res+=c;
		System.out.print(res);
		
	}
	
	
	
}
