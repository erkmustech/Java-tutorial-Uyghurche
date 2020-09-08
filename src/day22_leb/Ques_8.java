package day22_leb;

public class Ques_8 {

	public static void main(String[] args) {
		/*
		 
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
The string length will be at least 2.
left2("Hello") → "lloHe" left2("java") → "vaja" left2("Hi") → "Hi"
		 */
		
		String s1=left2("Hello");
		System.out.println(s1);
		
		
	}

	private static String left2(String s) {
		if(s.length()>2) {
			s=s.substring(2).concat(s.substring(0, 2));
		}
				return s;
	}

}
