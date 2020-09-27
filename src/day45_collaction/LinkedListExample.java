package day45_collaction;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<Integer>list1 = new LinkedList<>(); // polymorphsim, list is parentclass of the linkedlist.
		LinkedList<Integer>list = new LinkedList<>();
		
		list.add(50);
		list.add(900);
		
		System.out.println(list.get(0));
		
		System.out.println(list.contains(50));
		
		list.add(40);
		list.add(89);
		list.add(0);
		list.add(901);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		
	
		
	}

}
