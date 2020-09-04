package day10_controlFlowStatement;

public class Task43 {

	public static void main(String[] args) {
		// Write a Java Program to print the following table.
		
		System.out.println("Number |   quedrate");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+ "\t\t"+i*i);

			}
		
		System.out.println("---44----");
		final int Start_KPH=60;
		final int Max_KPH=150;
		final int increment=10;
		
		for(double kph=Start_KPH;kph<Max_KPH;kph+=increment) {
			double mph=kph*0.6214;
			System.out.println(kph+"\t\t"+mph);
		}
		
		System.out.println("----45---");
		
		/*
		 *User should be able to declare 2 values and program should display which number is largest.
if numbers are equal, it should display numbers are equal
Above steps need to repeated to number of times that is also declared by user.
		 */
		int a=10;
		int b=20;
		int r=3;
		for(int i=0;i<3;i++) {
			if(a>b) {
				System.out.println("a is large");
			}else if(a==b) {
				System.out.println("a is equal to be");
			}else {
				System.out.println("b is large");
			}
			
		}
		
		System.out.println("-------46-------");
		/*
		 * Write a program that the user to declare a positive integer. It should then print the multiplication table of that number.
		 */
		
		int j=7;
		for(int c=0; c<=10;c++) {
			System.out.println(j+"*"+c+"="+j*c);
		}
		
		
	}

}