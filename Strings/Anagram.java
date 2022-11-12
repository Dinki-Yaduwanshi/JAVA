mport java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first String");
		String str1=sc.nextLine();
		
		System.out.print("Enter second String");
		String str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram");
		}else {
				
			char[] str3=str1.toCharArray();
			char[] str4=str2.toCharArray();
			
			Arrays.sort(str3);
			Arrays.sort(str4);
			
			
		/*	if(str3.equals(str4)) {       // forgot they are character array
				System.out.println("It is Anagram");
			}else {
				System.out.print("It is not Anagram");
			}*/
			
			if(Arrays.equals(str3, str4)) {System.out.println("It is Anagram");
			}else {
				System.out.print("It is not Anagram");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
