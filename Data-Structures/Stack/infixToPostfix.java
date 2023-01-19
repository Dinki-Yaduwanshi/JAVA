package Stack;
import java.util.*;
public class Stackc {

	
		public static int precedence(char c) {
			if(c=='^') {
				return 3;
			}else if (c=='/'||c=='*') {
				return 2;
			}else if(c=='+'||c=='-') {
				return 1;
			}else return 0;
		}
	
	
	public static String conversion(String infix) {
		String res= new String();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<infix.length();i++) {
			char symbol=infix.charAt(i);
			
			if(Character.isLetter(symbol)) {
				res=res+symbol;
			}else 
				if(symbol=='(') {
				st.push(symbol);
			} else if (symbol==')') {
				
				while((st.isEmpty()!=true)&&st.peek()!='(') {
				res=res+st.pop();
				}
				
				if(st.isEmpty()!=true) {
					st.pop();
				}
			}else {
				while((st.isEmpty()!=true)&& (precedence(symbol)<=precedence(st.peek())&&st.peek()!='(')){
					res=res+st.pop();
				
					}
				    st.push(symbol);
				   }
			}
		while(st.isEmpty()!=true) {
			res+=st.pop();
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str="A+B-D+(S*y)";
		System.out.print(conversion(str));

	}

}
