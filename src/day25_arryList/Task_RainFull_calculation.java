package day25_arryList;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task_RainFull_calculation {

	public static void main(String[] args) {
		/*
		 Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles. 
		 The program should have methods that return the following:
			- total rainfall for the year
			- the average monthly rainfall - the month with the most rain - the month with the least rain
			Input Validation: Do not accept negative numbers for the monthly rainfall figures.
		 */
		double[] rainFall=new double[12];
		
		String[] month={"jan","feb","march","aypri","may","june","july","aug","sep","oct","nov","oct"};
		
		getArray(rainFall);
		
		getMonth(month);
		
		
		
	}

	private static String[] getMonth(String[] months) {
		return months;

		  
			
		}
		

	private static double[] getArray(double[] rainFall) {
		System.out.println("inter the rainFall of for 12 month");
		double sum=0;
		System.out.println(" --- month -------rainfall (inch)------");
	

		for(int i=0;i<rainFall.length;i++) {
//			System.out.println(month[i]);
		
			Scanner sc=new Scanner(System.in);
			
			rainFall[i]=sc.nextDouble();
			sum+=rainFall[i];
			
		}
		System.out.println("the total rainFall for the year is "+sum);
		System.out.println("the avarage rainfall is "+(sum/rainFall.length));	
		
		int MaxM = 0;
		int minM = 0;
		for(int i=0;i<rainFall[i];i++) {
			if(rainFall[i]>MaxM) {
				System.out.println("the most rainy month is "+MaxM);
				break;
			}if(rainFall[i]<minM) {
				System.out.println("the least rainy month is "+minM);
				break;
			}
		}
		return rainFall;
	}

}
