package day15_method_overloading;

public class Swaping_value {

	public static void main(String[] args) {
		//swaping is one of the important for method overriding 
		
		int num1=10;
		int num2=20;
		int num3;
		
		num3=num1;
		num1=num2;
		num2=num3;
			
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		
		/*solution , without using 3rd variable. 
		
		by using arthmetic calculation . 
		
		*/
		
		int n1=10;
		int n2=20;
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("n1 is "+n1);
		System.out.println("n2 is "+n2);
		
	}

}
