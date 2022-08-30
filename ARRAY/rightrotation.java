public class rightrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  int RR[]= {1,2,3,4,5,6,7};
  System.out.println("Before rotation :");
  for(int x:RR) {
	  System.out.print(x);
  }
  
  int temp=RR[0];
  
  for(int i =0;i<RR.length-1;i++) {
	  RR[i]=RR[i+1];
  }
  
  RR[RR.length-1]=temp;
  System.out.println("After rotation :");
  for(int x:RR) {
	  System.out.print(x);
  }
  
	}

}
