package day46_collectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStudent {
	
	public static void main(String[] args) {
		
		List<Integer> l1= new ArrayList<>(); // holding objects  student object
	
		
		l1.add(30);
		l1.add(12);
		l1.add(30);
		l1.add(90);
		l1.add(0);
		l1.add(89);
		
		System.out.println(l1);
		
		Collections.sort(l1);
		
		
		List<Student> l2= new ArrayList<>();
		l2.add(new Student(12,"mike"));
		l2.add(new Student(21,"mike"));
		l2.add(new Student(10,"ddd"));
		l2.add(new Student(11,"miwwwke"));
		l2.add(new Student(1,"miqwke"));
		
		System.out.println(l2.toString());
		
		Collections.sort(l2);
		
		System.out.println(l2.toString());
		
		
		
		
	}

}
