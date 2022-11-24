public class rightrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  int RR[]= {1,2,3,4,5,6,7};
  System.out.println("Before rotation :");
  for(int x:RR) {
	  System.out.print(x);
  }
  

      int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
        arr[0]=last;
        
    
  System.out.println("After rotation :");
  for(int x:RR) {
	  System.out.print(x);
  }
  
	}

}
