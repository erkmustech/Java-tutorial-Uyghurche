package day46_collectionFramwork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		// set  duplicate not allowed       
		// insertion orde not perserved. 
		
		Set<Integer> myset= new HashSet<>();
		
		myset.add(100);
		myset.add(200);
		myset.add(300);
		myset.add(1000);
		myset.add(999);
		myset.add(99);
		
		System.out.println(myset);
		System.out.println(myset.size());
		
		List<String> list= Arrays.asList("23","32","23", "j", "mm",  "43","87");
		
		Set<String> uniq=new HashSet<>(list);
		System.out.println("list: " +list);
		System.out.println("Set list : "+uniq);
		
		
		TreeSet<Integer> tset=new TreeSet<>();
		tset.add(100);
		tset.add(200);
		tset.add(300);
		tset.add(1000);
		tset.add(999);
		tset.add(99);
		System.out.println("ThreeSet : " +tset);
		
		
	}

}
