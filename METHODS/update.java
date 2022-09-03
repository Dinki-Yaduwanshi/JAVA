public class Update {

	
	/*static void update(int A[]) {
		A[0]=25;
	}*/

	
   static void	change(int a[],int i,int value) {
	a[i]=value;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int A[]= {2,4,6,8,10};
 /*update(A);
 System.out.print(A[0]);
*/ 
	change(A,3,24);
	for(int x:A) {
		System.out.print(x);
	}
 
	}

}
