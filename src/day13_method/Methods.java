package day13_method;

public class Methods {

	public static void main(String[] args) {
		// you can't create method inside the main method
		sayHello();
		add(21,23);
		mul(34,45);
		

	}
	
	public static void sayHello() {
		System.out.println("hello world!");
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}

}
