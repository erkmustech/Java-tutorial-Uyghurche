package day22_leb;

public class Ques_5 {

	public static void main(String[] args) {
		/*
		 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo" firstHalf("HelloThere") → "Hello" firstHalf("abcdef") → "abc"
		 */
		
		String s1=firstHalf("WooHoo");
		System.out.println(s1);
		
		String s2=firstHalf("abcdef");
		System.out.println(s2);
		
	}

	private static String firstHalf(String s) {
		s=s.substring(0,(s.length()/2));
				return s;
	}

}
