package day22_leb;

public class Ques_9 {

	public static void main(String[] args) {
		/*
		 Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
		 The string length will be at least 2.
right2("Hello") → "loHel" right2("java") → "vaja" right2("Hi") → "Hi"
		 */
		
		String s1=right2("Hello");
		System.out.println(s1);
		
		
	}

	private static String right2(String s) {
		if(s.length()>2) {
			s=s.substring(s.length()-2).concat(s.substring(0,s.length()-2));
		}
				return s;
	}

}
