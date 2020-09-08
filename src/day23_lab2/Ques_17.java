package day23_lab2;

public class Ques_17 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts a string and returns true if the string is palindrome.
		 */
		
		boolean b=palindrome("level");
		System.out.println(b);
		boolean b1=palindrome("lomal");
		System.out.println(b);
		boolean b2=palindrome("topot");
		System.out.println(b);
		boolean b3=palindrome("racecar");
		System.out.println(b);
	}

	private static boolean palindrome(String s) {
		String ps="";
		boolean flag;
		for(int i=s.length()-1 ;i>=0; i--) {
			ps+=s.charAt(i);
		}
	System.out.println("ps: "+ps);
	System.out.println("s: "+s);
	
	if(ps.equals(s)) {	
		  flag=true;
	}else {
		flag=false;
	}
		  return flag;

}
}
