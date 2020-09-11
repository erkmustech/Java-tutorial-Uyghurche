package day27_2d_arry;

public class Lab_Q1 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts an array and return true if 6 appears as either the first or last 
		 element in the array. The array will be length 1 or more.
		 int[] x = {1,2,6}; = > true int[] y = {6,1,2,3}; = > true int[] z = {13,6,1,2,3}; = > false
		 */
		
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		
		System.out.println("if first and seond element is 6 please give true , other give false");
		
		System.out.println("x array ; "+firstLast6(x));
		System.out.println("y array :"+firstLast6(y));
		System.out.println("z array :"+firstLast6(z));
		
		
	}

	private static boolean firstLast6(int[] arr) {
		if(arr.length<1) {
			return false;
		}
		if(arr[0]==6||arr[(arr.length-1)]==6) {
			return true;
			
		}else {
		return false;
	}
  }

}
