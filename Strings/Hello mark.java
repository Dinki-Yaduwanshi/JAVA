import java.util.*;
import java.math.*;
public class CountString {


			public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				String s1=sc.next();
				int sum=0;
				String[] s2=s1.split(",");
				System.out.print(s2.length);
				for (int i=0;i<s2.length;i++){
					
				for(int j=0;j<s2[i].length();j++) {
					int li=0;
					int ri=s2[i].length()-1;
					while(li<ri) {
						String l=String.valueOf(s2[j].charAt(li));
						String m=String.valueOf(s2[j].charAt(ri));
						System.out.println(l+" "+m);
					
						int g=Math.abs((l.compareTo("a")+1)-(m.compareTo("a")+1));
						sum+=g;
					    System.out.println(sum);
						li++;
						ri--;
					}
					if(s2[i].length()%2!=0){
					    int mid=s2[i].length()/2;
					    String n=String.valueOf(s2[j].charAt(mid));
					    System.out.println(n);
					    int k=Math.abs((n.compareTo("a")+1));
					    sum+=k;
					    System.out.print(sum);
					}
				
					
				}
				
				System.out.println();
				}
					
			}
		}

//has errors
