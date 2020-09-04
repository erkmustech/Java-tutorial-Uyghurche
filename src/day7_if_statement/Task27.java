package day7_if_statement;

public class Task27 {

	public static void main(String[] args) {
		/*Task-27
		Write a Java program to implement following logic using if statement
		1. if hour is less than 12 noon, greet with Good Morning
		2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon 3. 
		if hour is greater than or equal to 3 pm, greet with Good Evening
	*/
		
		
		int hour = 14;
		
		if(hour< 12) {
			System.out.println("good morning");
		}if(hour >12 && hour < 15) {
			System.out.println("good afternoon");
		}
		if(hour >  15) {
			System.out.println("good evening");
		}
		
		
		System.out.println("--task 28 ---");
		
		double price= 28;
		int quantity=289;
		double revenue=price*quantity;
		
		if(revenue>5000) {
			double discount=revenue*0.1;
			double net_revenue = revenue-discount;
			System.out.println("your total reveniu is "+ revenue+" and the discount is " + discount+" your net revenue is "+net_revenue);
		}
		
		System.out.println("---WaterMalen---");
		
		int sm;
		boolean msm = false;
		sm=10;
		
		if(sm>20) {
			System.out.println("I have enough mellon");
			msm =true;
			
		}if(msm) {
			System.out.println("good job");
		}if(msm=false) {
			System.out.println("i need more melon");
		}
		
		System.out.println("---small task-2 ----- ");
		
		int x, y;
		x=101;
		y=0;
		
		if(x>100) {
			System.out.println("y=20");
			
		}
		if(y==100) {
			System.out.println( "x=1");
		}else {
				System.out.println("x=0");
				
			}
		System.out.println("---task 32----");
		/*
		 Task-32
• Declare 3 numbers
• Program should display which one is largest 
	
		 */

		
	
	int a=120;
	int b=2019;
	int c=90;
	
	if(a>b && a>c) {
		System.out.println("a is biggest number");
	}else if(b>a&&b>c) {
		System.out.println("b is biggest num");
	}else if(c>a&&a>b) {
		System.out.println("c is biggest num");
	}


}
}
	
