package day25_arryList;

import java.util.Scanner;

public class PassElements {

	public static void main(String[] args) {
		int [] nums= {3,4,7,9,5,4,0};
		for(int num:nums) {
			showValue(num);		
		}
	}
	private static void showValue(int n) {
		if(n>3) {
		System.out.println("your score is: "+n+", you passed");
		
	}else {
		System.out.println("your score is : "+n+", you didn't pass");
	}


       //ther are second way to pass the value to methods	
		System.out.println("------  passs value without for ech loop-------");
				
		int [] num1s= new int[4];		
		getValue(num1s);		
		showArray(num1s);	
}

	private static void getValue(int[] array) {
		Scanner s=new Scanner(System.in);
		System.out.println("inter a serious of nums");
		
		for(int i=0;i<array.length;i++) {
			System.out.println("inter the number"+(i+1));
		    array[i]=s.nextInt();		
		}
	}	
   public static void showArray(int[] array) {
	for(int value:array	) {
		System.out.println(value);
	}
	
	
	
  }
}
		
		

