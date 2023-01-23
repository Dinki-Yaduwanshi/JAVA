input: 1 2 3
output: 10

input:5 8 2 1 0 9
output: 390693



public class Main
{
	public static void main(String[] args) {
		int[] it={5,8,2,1,0,9};
		int sum=0;
		for(int i =0;i<it.length-1;i++){
		    sum=(int) (sum+Math.pow(it[i],it[i+1]));
		    
		   	}
		
		sum+=1;
		System.out.print(sum);
		
		
	}
}
