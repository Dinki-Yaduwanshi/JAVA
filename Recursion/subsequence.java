import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    String str=sc.next();
    ArrayList<String> res=gss(str); 
    System.out.print(res);
    
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String>b = new ArrayList<>();
            b.add("");
            return b;
            
        }
        
        
        char c=str.charAt(0);
        String rest=str.substring(1);
        ArrayList<String> rgss= gss(rest);
        ArrayList<String>m = new ArrayList<>();
        for(String r:rgss){
            m.add(""+r);
        }
        for(String r:rgss){
            m.add(c+r);
        }
        
        return m;
    }

}
