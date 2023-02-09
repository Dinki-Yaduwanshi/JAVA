import java.util.*;
class Main{
	
	public static void main(String[] args) {
		System.out.print("Enter Name");
		Scanner sc= new Scanner(System.in);
		String str1=sc.next();
		String[] str=str1.split(" ");
		String name=str[0];
		
		System.out.print("Enter Enrollment number:");
		String enrol=sc.next();
		
		System.out.print("Are you ready for quiz ? (Press Y = Yes and N = No)");
		String p=sc.next();
		
		if(p.charAt(0)=='Y') {
		ArrayList <String> ques = new ArrayList<String>(); //arraylist for strings
		ques.add("Number of primitive data types in Java are?");
		ques.add("Which of the following is not a Java features?");
		ques.add("The \\u0021 article referred to as a");
		
		ques.add("_____ is used to find and fix bugs in the Java programs.");
		ques.add("Java was previously known as:");
		ques.add("Number of primitive data types in Java are?");
		ques.add("Which of the following is not a Java features?");
		ques.add("The \\u0021 article referred to as a");
		
		ques.add("_____ is used to find and fix bugs in the Java programs.");
		ques.add("Java was previously known as:");
		
		
		String[] inp= new String[ques.size()];
		
		
		ArrayList <String> option = new ArrayList<String>();
		option.add("a. 6");
		option.add("b. 7");
		option.add("c. 8");
		option.add("d. 9");
		
		option.add("a. Dynamic");
		option.add("b. Architecture Neutral");
		option.add("c. Object-oriented");
		option.add("d. Use of pointers");
		
		option.add("a. Hexadecima");
		option.add("b. Octal escape");
		option.add("c. Unicode escape sequence");
		option.add("d. Line feed");
		
		option.add("a. Java Debugger");
		option.add("b. Unicode escape sequence");
		option.add("c. Line feed");
		option.add("d. None of these");
		
		option.add("a. Oak");
		option.add("b. Jads");
		option.add("c. Oaks");
		option.add("d. None of these");
		
		option.add("a. 6");
		option.add("b. 7");
		option.add("c. 8");
		option.add("d. 9");
		
		option.add("a. Dynamic");
		option.add("b. Architecture Neutral");
		option.add("c. Object-oriented");
		option.add("d. Use of pointers");
		
		option.add("a. Hexadecima");
		option.add("b. Octal escape");
		option.add("c. Unicode escape sequence");
		option.add("d. Line feed");
		
		option.add("a. Java Debugger");
		option.add("b. Unicode escape sequence");
		option.add("c. Line feed");
		option.add("d. None of these");
		
		option.add("a. Oak");
		option.add("b. Jads");
		option.add("c. Oaks");
		option.add("d. None of these");
	
		
		
		String[] corr= new String[ques.size()]; 
		corr[0]="c";
		corr[1]="d";
		corr[2]="c";
		corr[3]="a";
		corr[4]="c";
		corr[5]="c";
		corr[6]="d";
		corr[7]="c";
		corr[8]="a";
		corr[9]="c";
		int j=0;
		for(int i =0;i<ques.size();i++) {
			System.out.println("Q"+i+ " "+ ques.get(i));
			
			
			System.out.println(option.get(j));
			System.out.println(option.get(j+1));
			System.out.println (option.get(j+2));
			System.out.println(option.get(j+3));
			System.out.println();
			
			inp[i]=sc.next();
			
			j+=4;
			
			
			}
		
		int count=0; int per=0;
		for(int i=0;i<ques.size();i++) {
			
			if(inp[i].charAt(0)==corr[i].charAt(0)) {
				count++;
			}
		
		}
		  
		//System.out.println(count+"/"+ques.size());
			per=(count/ques.size())*100;
			
		System.out.println("NAME" + '\t' + "ENROLLMENT"+'\t'+"MARKS "+'\t'+"PERCENTAGE");
		System.out.print(name + '\t'+ enrol+'\t'+count+'\t'+per);	
			
			
	}else
		{
			System.out.print("Thank You");
		}
		
		
		
	
	}
	
}
