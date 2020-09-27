package day46_collectionFramwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoopSet {

	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		nums.add(50);
		nums.add(59);
		nums.add(90);
		nums.add(0);
		nums.add(10);
		nums.add(999);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		for(int n: nums) {
			System.out.print(n+" | ");
		}
		System.out.println();
		nums.forEach(n-> System.out.print(n+" | "));
		
		System.out.println( );
		
		Iterator<Integer> it= nums.iterator();
		
		//  hasNext , next methods
		// hasNext return true, if there is still next value, return false when it reaches the end or empty.
	   //  next() method , return the currant value and moce to next value
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.print(it.next()+" | ");
		}
		System.out.println();
		
//		System.out.println(it.next());   || no shuch element exception
		
		Iterator<Integer> it2= nums.iterator();
		while(it2.hasNext()) {
			int var=it2.next();
			if(var>100) {
				it2.remove();
			}
		}
		System.out.print(nums+" | ");
	
		
		
		
	}

}
