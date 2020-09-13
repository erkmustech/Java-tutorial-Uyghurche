package day32_arrayList_part2;

import java.util.ArrayList;

public class Custome_methods {

	public static void main(String[] args) {
		ArrayList<Integer> numlist=new ArrayList<>();
		
		numlist.add(10);
		numlist.add(20);
		numlist.add(30);
		numlist.add(40);
		numlist.add(10);
		numlist.add(20);
		numlist.add(30);
		numlist.add(60);
		
		printList(numlist);
		
		System.out.println();
		System.out.println("--------- 2 -------");
		
		ArrayList<Double> dlist=new ArrayList<>();
		dlist.add(24.5);
		dlist.add(32.4);
		dlist.add(33.0);
		dlist.add(24.5);
		dlist.add(32.4);
		dlist.add(33.0);
		
		double sum=sumList(dlist);
		
		
		System.out.println(sum);
		
		

		
		
	}

	private static double sumList(ArrayList<Double> dlist) {
		double d1=0;
		for(double d:dlist) {
			d1=d1+d;
		}
		return d1;
	}

	private static void printList(ArrayList<Integer> numlist) {
		for(int n:numlist) {
			System.out.print(n+" ");
		}
	}
	

}
