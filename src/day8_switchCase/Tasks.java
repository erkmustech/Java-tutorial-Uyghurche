package day8_switchCase;

public class Tasks {

	public static void main(String[] args) {

		/*
		Task-36
		Write a program that creates a calculator by using switch statements */
		
		double a=33;
		double b=88;
		char operator='/';  // ==  String operator="+";
		
		switch(operator) {
		case '+':
			System.out.println(a+b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		default:
			
			
		}
		
	}

}
