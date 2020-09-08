package day22_leb;

public class Ques_7 {

	public static void main(String[] args) {
		/*
		 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter 
		 string on the outside and the longer string on the inside.
comboString("Hello", "hi") → "hiHellohi" comboString("hi", "Hello") → "hiHellohi" comboString("aaa", "b") → "baaab"
		 */
		
		String s1=comboString("Hello", "hi");
		System.out.println(s1);
	}

	private static String comboString(String a, String b) {
		String s;
		if(a.length()>b.length()) {
			s=b.concat(a).concat(b);
		}else {
			s=a.concat(b).concat(a);
		}
		
		return s;
	}

}
