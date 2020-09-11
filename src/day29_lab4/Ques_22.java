package day29_lab4;

public class Ques_22 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts an array and prints true if the number 1's is greater than the number 4's
		
		 */
		
		         int[] x = {1,4,1} ;// true
				 int[] x1 = {1,4,1,4};// false
				 int[] x2 = {1,1};// true
				 
				 System.out.println(one(x));
				 System.out.println(one(x1));
		
	}
	public static boolean one(int[]arr) {
		int count=0,count1=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count++;
			
		}else if(arr[i]==4) {
			count1++;
		}
	}
		
		if(count>count1) {
			return true;
		}else {
			return false;
		}

}
}
