package day18_input;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("please enter the number");
	    int num1=input.nextInt();
	    System.out.println("please inter second num");
	    int num2=input.nextInt();

	    
	    input.nextLine(); //google it..
	    
	    System.out.println("please inter the name");
	    String name=input.nextLine();
	    
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(name);
	    
	    
	
	}

}
