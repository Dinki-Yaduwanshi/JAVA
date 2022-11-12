import java.util.Scanner;

public class ConsonentVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();//to reduce comparison
		int cons=0,count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)!=' ') {
			/*	total++;*/
				if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u') {
					count++;}else
				if(str.charAt(j)>'a'&&str.charAt(j)<'z') {
					cons++;
				
				}
			}
		}
		//int cons =total-count;
		System.out.print("vowels "+count);
		System.out.print("consonents "+cons);
		
			
			
		}

	}
