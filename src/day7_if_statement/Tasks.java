package day7_if_statement;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		System.out.println("please inter you score!");
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		
		if (score >= 90) {
			System.out.println("your score is" + score+" you are A grid");
		} else if(score>=80) {
			System.out.println("your score is" + score+" you are B grid");
			
			
		}else if(score>=60) {
			System.out.println("your score is" + score+" you are c grid");
		}else {
			System.out.println("your score is" + score+" you should go back");
		}
		
		
		System.out.println(" --- task 30-----");
		/*Task-30
		Write a Java program:
		1) Declare and initialize a number
		2) Display whether the number is an odd number or even number. */
		
		int num=100;
		if(num%2==0) {
			System.out.println("this is even number");
		}else {
			System.out.println("this is odd number");
		}
		
		
	} 
	

}
