import java.util.*;
 public class Box{
	
	double length,breadth,height;
		
		Box(double l,double b,double h){
			this.length=l;
			this.breadth=b;
			this.height=h;
			}
		
       double volume() {
    	   double v=length*breadth*height;
    	   return v;}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			HashSet<Double> volume1=new HashSet<>();
			HashSet<String> box=new HashSet<>();
		System.out.print("Enter number of boxes:");
		int n=sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println("Box"+i);
			System.out.println("Enter length:");
			double l=sc.nextDouble();
			System.out.println("Enter breadth:");
			double b=sc.nextDouble();
			System.out.println("Enter height:");
			double h=sc.nextDouble();
			
		Box k =new Box(l,b,h);
		if(volume1.contains(k.volume())) {
			System.out.println("box"+i+" is not added to HashSet");
		}else {
			volume1.add(k.volume());
			box.add("box"+i);
			System.out.println("box"+i+" is added to HashSet");
			
		}		
}
	}

}
