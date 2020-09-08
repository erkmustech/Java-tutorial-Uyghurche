package day22_leb;

public class Ques_4 {

	public static void main(String[] args) {
		/*
		 Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
		  If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty 
		  string "" yields the empty string "".
firstTwo("Hello") → "He" firstTwo("abcdefg") → "ab" firstTwo("ab") → "ab"
		 */
		
		String s1=firstTwo("Hello");
		System.out.println(s1);
		String s2=firstTwo("b");
		System.out.println(s2);
		
	}

	private static String firstTwo(String s) {
		if(s.length()<2) {
			return s;
		}else {
			s=s.substring(0,2);
		}
		return s;
				
	}

}
