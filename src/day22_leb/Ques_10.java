package day22_leb;

public class Ques_10 {

	public static void main(String[] args) {
		/*
		 Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
		 such as with "edited".
frontAgain("edited") → true frontAgain("edit") → false frontAgain("ed") → true
		 */
		boolean s1=frontAgain("qedited");
		System.out.println(s1);
	}
	public static boolean frontAgain(String s) {
		if(s.substring(0,2).equals(s.substring(s.length()-2))) {
			return true;
		}else {
		return false;
		
		}
		
	}

}
