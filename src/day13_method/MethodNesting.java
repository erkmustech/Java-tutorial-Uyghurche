package day13_method;

public class MethodNesting {

	public static void main(String[] args) {
		System.out.println("call deepre");
		deeper();
		
	}

	private static void deeper() {
		deep();
		System.out.println("deeper geliyor");
		
	}

	private static void deep() {
		System.out.println("tamam deep geliyor");
		
	}
	
	

}
