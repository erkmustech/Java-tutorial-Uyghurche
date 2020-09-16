package day36_static_class;

public class StaticImport {
	public static void main(String[] args) {
		System.out.println(Math.sqrt(16));
		System.out.println(sqrt(16));
		method();

		
		
	}
	
	private static int sqrt(int i) {
		int b=i*i;
		return b;
	}

	public static void method() {
		System.out.println("Test");

	}
}
