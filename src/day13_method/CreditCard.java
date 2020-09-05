package day13_method;

public class CreditCard {

	public static void main(String[] args) {
		double salary=20000;
		int rating=4;
		
		if(salary>10000 && rating>3) {
			qualify();
		}else {
			unqualify();
		}
		
	}

	private static void qualify() {
		System.out.println("you are eligible to creditcard  amount of 1000USD");
		
	}

	private static void unqualify() {
		System.out.println("sorry, you are not qualified to get credicard");
		
	}

}


