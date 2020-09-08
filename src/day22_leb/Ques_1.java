package day22_leb;

public class Ques_1 {

	public static void main(String[] args) {
		/*
		 Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!" helloName("Alice") → "Hello Alice!" helloName("X") → "Hello X!"
		 */
		
		String s=helloName("Bob");
		helloName("ALice");
		helloName("X");
		System.out.println(s);
		System.out.println(helloName("ALice"));
		System.out.println(helloName("X"));
		
		
	}

	private static String helloName(String name) {
		String re="hello ".concat(name).concat("!");
		
		return re;
		
	}

}
