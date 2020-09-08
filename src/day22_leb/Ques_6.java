package day22_leb;

public class Ques_6 {

	public static void main(String[] args) {
		/*
		 Given a string, return a version without the first and last char, so "Hello" yields "ell". 
		 The string length will be at least 2.
withoutEnd("Hello") → "ell" withoutEnd("java") → "av" withoutEnd("coding") → "odin"
		 */
		
		String s1=withoutEnd("Hello");
		System.out.println(s1);
		String s2=withoutEnd("java");
		System.out.println(s2);
		
	}

	private static String withoutEnd(String s) {
		if(s.length()>2) {
		
		s=s.substring(1,s.length()-1);
				
	    }else {
	    	return s;
	    }
		return s;
	}

}
