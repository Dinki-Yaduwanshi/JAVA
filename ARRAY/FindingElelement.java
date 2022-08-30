public class FindingElelement {


	public static void main(String[] args) {
		int A[]=new int[5];
		int B[]={2,4,5,6,7,45,676,895};
		int key=45;
	for(int i=0;i<B.length;i++){
	    if(B[i]==key){
	        System.out.println("Found at "+ i);
	        System.exit(0);//no need to traverse further
	    }
	    
	}
	}
}
