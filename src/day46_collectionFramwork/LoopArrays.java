package day46_collectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class LoopArrays {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(59);
		nums.add(90);
		nums.add(0);
		nums.add(10);
		
//		System.out.println(nums);
		System.out.println("for each loop");
		
		for(Integer num: nums) {
			System.out.print(num+" | ");
		}
		System.out.println();
		System.out.println(" for loop" );
		
		for(int i=0;i<nums.size();i++) {
			System.out.print(nums.get(i)+" | ");
		}
		
		// loop using foreach method 
		// lambda expression
		System.out.println();
		System.out.println("ambda expression  ");
		nums.forEach(n->System.out.print(n+" | "));
		
		System.out.println();
		nums.removeIf(n-> n>70);
		nums.forEach(n->System.out.print(n+" | "));
		
		nums.removeIf(n-> n%2==0);
		nums.forEach(n->System.out.println(n+" | "));
		
	}

}
