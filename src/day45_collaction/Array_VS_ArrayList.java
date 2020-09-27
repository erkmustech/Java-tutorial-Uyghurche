package day45_collaction;

import java.util.ArrayList;
import java.util.List;

public class Array_VS_ArrayList {
	public static void main(String[] args) {
		
		//Arrays are fixed in size
		// Allows duplicates 
		// keep ordering
		//  allos premitive and object
		
		int[] num = {2,4,6,7,10};
		String[] name=new String[3];
		
		name[0]="max";
		name[1]="min";
		
		
		
		ArrayList<Integer> numlist= new ArrayList<>();
		
		List<Integer> numlist2= new ArrayList<>();
		
		numlist.add(44);
		numlist.add(59);
		numlist.add(0);
		
		System.out.println(numlist.toString());
		
		
	}

}
