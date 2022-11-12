
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="java";
    
   int l=str.length();
   System.out.println(l);//length of string
   
   String str1=str.toLowerCase();
   System.out.println(str1);
	
   String str2=str.toUpperCase();
   System.out.println(str2);
		
   String s="  WELCOME   ";
   String pa=s.trim();
   System.out.println(s);
   System.out.println(pa);
   
   String sub=str.substring(0,2);
   System.out.println(sub);
   
   String d=str.replace('a', 'l');
   System.out.println(d);
   
  boolean a =str.startsWith("J");
  System.out.println(a);
  
  boolean C =str.endsWith("A");
  System.out.println(C);
  
  char c=str.charAt(1);
  System.out.println(c);
  
  
  int o =str.indexOf("a",2);
  System.out.println(o);
  
  int p =str.lastIndexOf("a",0);
  System.out.println(p);
  
  String str4="JAVA";
  String str5="java";
  String str6="PYTHON";
  String str7="python";
  
  System.out.print(str.equals(str5));
  System.out.println(str.equals(str4));
  System.out.println(str7.equals(str6.toLowerCase()));
  
  System.out.print(str6.equalsIgnoreCase(str7));
  
  System.out.print(str6.compareTo(str7));
  
	}

}
