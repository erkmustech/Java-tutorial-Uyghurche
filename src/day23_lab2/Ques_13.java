package day23_lab2;

public class Ques_13 {

	public static void main(String[] args) {
		/*
		 Given a string, return a string where for every char in the original, there are two chars. doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
		 */
		
		String s1=doubleChar("Hi-There");
		System.out.println(s1);
		String s2=doubleChar("AABBe");
		System.out.println(s2);
	}

	private static String doubleChar(String s) {
		String ns="";
		for(int i=0;i<s.length();i++) {
		    ns+=s.substring(i,i+1)+s.substring(i,i+1);
		}
		return ns;
	}

}
