public class MaxElement {
	public static void main(String[] args) {
		int A[]=new int[5];
		int B[]={2,1,5,6,7,4,6,3};
		int max=B[0];
	 for(int i =0;i<B.length;i++){
	     if(B[i]>max){
	         max=B[i];
	     }
	     
	 }System.out.println(" Max: "+max);
	    }
}
