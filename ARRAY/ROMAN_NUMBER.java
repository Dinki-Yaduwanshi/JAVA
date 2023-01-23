public class Main
{
   static int value(char c){
        if(c=='I'){
            return 1;
        }else 
        if(c=='V'){
            return 5;
        }else 
        if(c=='X'){
            return 10;
        }
        else 
        if(c=='M'){
            return 1000;
        }else 
        if(c=='C'){
            return 100;
        }
        else if(c=='D'){
            return 500;
        }else
        
        return -1;
        
    }
    
     static int conversion (String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            int s1=value(str.charAt(i));
            if(i+1<str.length()){
                int s2=value(str.charAt(i+1));
                
                if(s1>=s2){
                    res=res+s1;
                }else{
                    res=res+s2-s1;
                    i++;
                }
                
            }else{
                res=res+s1;
            }
                
            
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		String s ="CM";
		System.out.print(conversion(s));
	}
}
