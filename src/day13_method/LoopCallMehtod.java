package day13_method;

public class LoopCallMehtod {

	public static void main(String[] args) {
		System.out.println("hellow from main method");
		for(int i=0;i<3;i++) {
			out();
			System.out.println("back to main method");
			
		}
	}

	private static void out() {
		System.out.println("hellow from out");
		
	}

}
