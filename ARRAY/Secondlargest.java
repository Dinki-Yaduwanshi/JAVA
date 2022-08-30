public class Secondlargest {

	public static void main(String[] args) {
		int A[]=new int[5];
		int B[]={2,4,5,6,7,45,676,895};
		int max1=B[0];
		int max2=B[0];
	 for(int i =0;i<B.length;i++){
	     if(B[i]>max1){
	         max2=max1;
	         max1=B[i];
	     }else if(B[i]>max2){
	         max2=B[i];
	     }
	    
	 }
	 System.out.print(" Max2: "+max2);
	}
}
