package day23_lab2;

public class Ques_14 {

	public static void main(String[] args) {
		/*
		 Given a string, return true if it ends in "ly". endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
		 */
		
		boolean s1=endsLy("oddly");
		System.out.println(s1);
		boolean s2=endsLy("olyddy");
		System.out.println(s2);
		
		
	}

	private static boolean endsLy(String s) {
//		if(s.endsWith("ly"))
	   if(s.substring(s.length()-2).equals("ly"))
		return true;
		else {
		return false;
	}

}
}
