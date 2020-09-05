package day13_method;

public class PassArg {

	public static void main(String[] args) {
		score("max", 90);
		score("min", 99);
		score("erk", 100);
		score("furkan", 100);
		score("john" );
	}

	private static void score(String n) {
		
		System.out.println(n+" ,sorry no score");
		
	}

	private static void score(String m, int i) {
		if(m=="max") {
			i=i-5;
		}
		System.out.println(m+", your score is "+ i);
		
	}

}
