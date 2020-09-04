package day10_controlFlowStatement;

public class Ternary_operator {
	public static void main(String[] args) {
			
		
		int y=5;
		System.out.println(y>2 ? y<4 ? 10 : 8 : 7);  //ternary operator 
		
		System.out.println("---the if satment of the ternary operator");
		
		int x=5;
		if(x>2) {
			if(x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
			}
		}else {
			System.out.println(7);
		}
		
		System.out.println("-----task 40-----");
		/*
		 Task-40
Write a program that displays all even numbers between 1-100 in same line
		 */
		
		int i=0;
		for(i=0;i<100;i++) {
			if(i%5==0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println("---task 42---");
		/*
		 Write a program that displays sum of even and odd numbers between 1 and 100 excluding 100
		 */
		int sumOdd = 0;
		int sumEven = 0;
		for(int h=1;h<100;h++) {
			if(h%2==0) {
				sumEven=sumEven+h;
			}else {
				sumOdd=sumOdd+h;
			}
		}
		System.out.println("the sum of even number is "+sumEven);
		System.out.println("the sum of odd numbe ris "+ sumOdd);
		
		
	}

}