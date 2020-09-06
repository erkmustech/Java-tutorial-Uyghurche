package day15_method_overloading;

public class Task71 {

	public static void main(String[] args) {
		/*
		ØCreate a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
Feet is the first parameter, inches is the second parameter.

ØYou should validate that the first parameter feet is >=0, and second parameter inches is >=0 and <=12. 
Return -1 from the method if either of the above is not true.
ØIf the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to 
this method and return that value.
ØCreate a second method of the same name but with only one parameter inches is the parameter and validate
 it >=0, return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.
ØCall the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
ØHints : Use double for your number datatypes 1 inch = 2.54cm and 1 ft =12 inches
		 */
		
		int feet=8;
		int inc=46;	
		double cm=calcFeetAndInchesToCentimeters(feet,inc);
		double cm1=calcFeetAndInchesToCentimeters(inc);	
		System.out.println(feet+" feet and"+inc+" inc is equal to "+cm+" cantermer");
		System.out.println(feet+" feet and"+inc+" inc is equal to "+cm1+" cantermer");
	}

	private static double calcFeetAndInchesToCentimeters(int inc) {
		double feet=0,remain=0;
		  if(inc>=0 && inc<12) {
		    feet=inc/12;
		    remain=inc%12;
		    System.out.println(inc+"inc is equal to "+feet+" feet "+ remain);
		    return feet;
		  }else {
			return -1;
		}
	}

	private static double calcFeetAndInchesToCentimeters(int feet, int inc) {
		double cm=0;
		  if(feet>=0 && inc>=0 && inc<12) {
		    cm=feet*12*2.54+inc*2.54;
		    return cm;
		  }else {
			return -1;
		}
		
	}

}
