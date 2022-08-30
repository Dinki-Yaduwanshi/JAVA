package com.array.one;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();// creating an arrayList
		
		//using add method to add element
		list.add(12);
		list.add(13);
		list.add(125);
		list.add(128);
		list.add(129);
		
		//to print
		System.out.print(list);
		
		//to find some element
		System.out.println(list.contains(12));
		System.out.println(list.contains(15));
		
		//to update
		list.set(3,33);
		System.out.println(list);
		Scanner sc=new Scanner(System.in);
		//for taking input
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.print(list);
		
		
	}

}
