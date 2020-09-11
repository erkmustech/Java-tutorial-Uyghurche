package day27_2d_arry;

import java.util.Arrays;

public class Ragged_array {

	public static void main(String[] args) {
		int [][] array=new int[4][];
		
		array[0]=new int[3];
		array[1]=new int[4];
		array[2]=new int[5];
		array[3]=new int[1];
		
		
		int[][] array2= {{0,1,9},{7,5,0},{0,7,0,0,0},{10}};
		
		System.out.println(array2[0][0]);
		System.out.println(Arrays.deepToString(array2));
		System.out.println(Arrays.toString(array2[2]));
		
		//NOTE: deeptostring for 2d array, toString is for array.
		//      in array, we are calling the method by class name, other by reference name. 
		//      Arrays.toSting  VS sc.nextInt();
		
		
		
		
		//      sort()  : sorts array in ascending order
		
		Arrays.sort(array2[1]);
		System.out.println(Arrays.toString(array2[1]));
		
		String[] country= {"America","UK","germany", "Netherlands","Franch","Japan","Turkey"};
		
		Arrays.sort(country);
		System.out.println(Arrays.toString(country));
		
		
		
		//binary search 
		
		int[] numX= {1,2,3,46,72};
		System.out.println("index number of 3 is "+Arrays.binarySearch(numX, 3));
		System.out.println("index number of 4 is "+Arrays.binarySearch(numX, 4));  //insertion point, after 3 = -3 -1=-4 
		
		
		//copyOf()
		
		double[] d= {1.2,4.5,6.9,9.9};
		double[] d1=d;
		System.out.println(Arrays.toString(d1));
		d[3]=99.99;
		System.out.println(Arrays.toString(d1));
		
		double[]d2=Arrays.copyOf(d1, d1.length);
		System.out.println(Arrays.toString(d2));
		d1[0]=12;
		System.out.println(Arrays.toString(d1));
		// = VS copyOf = equal is always equal, copy is only time being. 
		
		//  String : == VS .equals 
		// array:  = VS copyOf
		
		
		
	}

}
