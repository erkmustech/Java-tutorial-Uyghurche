package day24_array;

import java.util.Random;

public class Task_91 {
	public static void main(String[] args) {
		/*
		 ØCreate an array with 10 elements
ØInitialize each array element with random values between 0 and 100 but less than 100 ØPrint each array element
		 */
		
		Random r=new Random();
		int [] rn=new int[10];
		
		for(int i=0;i<10;i++) {
			rn[i]=r.nextInt(100);
			System.out.print(rn[i]+",");
		}
		
		
	}

}
