import java.util.Scanner;
public class Divide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String");
		String str=sc.nextLine();
		System.out.print("Enter number of parts");
		int num=sc.nextInt();
		int n =str.length();
		int temp=0;
		String[] str1=new String[str.length()];
		if(n%num!=0) {
			System.out.print("It cannot be divided");
		}
		else {
			int a = n/num;
			
			
			for(int i=0;i<n;i+=a) {
				String part=str.substring(i,i+a);
				str1[temp]=part;
				temp++;
			}
			
			
			for(int i=0;i<temp;i++) {
				System.out.println(str1[i]);
			}
		}
		
		

	}

}
