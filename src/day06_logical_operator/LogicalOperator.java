package day06_logical_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		char a='A';
		char b =65;
		
		int i=12;
		int y=11;
		
		
		boolean res1 = (i==y)|(a==b); //F & T = F
		boolean res2= (i==y)||(a==b);
		
		System.out.println("res1 = "+res1);
		System.out.println("res2 = "+res2);
		
		/*
		What is difference between and || in Java?
				The | operator performs a bitwise OR of its two operands (meaning both sides must evaluate to false for it 
						to return false) while the || operator will only evaluate the second operator if it needs to
		*/
		
		boolean res3 = (i==y)&(a==b); //F & T = F
		boolean res4= (i==y)&&(a==b);
		
		System.out.println("res3 = "+res3);
		System.out.println("res4 = "+res4);
		
		
		
		 
		
	
		
		
		

	}

}
