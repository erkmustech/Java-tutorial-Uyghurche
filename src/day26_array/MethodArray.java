package day26_array;

import java.util.Scanner;

public class MethodArray {

	public static void main(String[] args) {
		
		System.out.println(findCar(4,"honda"));
		
	}
	
	public static String[] createArray(int arraySize) {
		Scanner s=new Scanner(System.in);
		
		String[] carArray=new String[arraySize];
		for(int i=0;i<carArray.length;i++) {
			System.out.println("enter car array : "+(i+1));
			carArray[i]=s.next();
		}
		
		return carArray;
		
		
	}
	
	public static boolean findCar(int value , String toFindCar) {
		for(String car: createArray(value)) {
			if(car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
			
		}
		return false;
	}

}
  