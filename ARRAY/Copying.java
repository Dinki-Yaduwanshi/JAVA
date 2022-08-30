public class Copying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int A[]= {1,2,3,4,5,6};
 int B[] =new int[6];
 for(int i =0;i<6;i++) {
	 B[i]=A[i];
 }

 System.out.print("copying :" );
 for(int x:B)
 {
	 System.out.print(x);
	 }
 System.out.println();
 
 for(int j=A.length-1,i=0 ;i<6&&j>=0; j-- ,i++) {
	
		 B[i]=A[j];
		 
	 }
	 
 
 System.out.println("Reverse Copying : " );
 for(int x:B)
 {
	 System.out.print(x);
	 }
 }

}
