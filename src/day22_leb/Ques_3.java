package day22_leb;

public class Ques_3 {

	public static void main(String[] args) {
/*
 Create a method return a new string made of 3 copies of the last 2 chars of the original string.
  The string length will be at least 2.
extraEnd("Hello") → "lololo" extraEnd("ab") → "ababab" extraEnd("Hi") → "HiHiHi"
 */
		
		String s1=extraEnd("Hello");
		System.out.println(s1);
		
		String s2=extraEnd("H");
		System.out.println(s2);
		
	}

	private static String extraEnd(String s) {
		String ns="";
		if(s.length()>=2) {
//			s=dum+dum+dum
			for(int i=0;i<3;i++) {
			ns+=s.substring(s.length()-2);
			}
		}else {
			return "invalid string";
		}
		return ns; 
	}

}
