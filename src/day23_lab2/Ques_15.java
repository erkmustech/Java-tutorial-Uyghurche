package day23_lab2;

public class Ques_15 {

	public static void main(String[] args) {
		/*
		 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as 
		 with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
hasBad("badxx") → true hasBad("xbadxx") → true hasBad("xxbadxx") → false
		 */
		
		boolean b=hasBad("badxx");
		System.out.println(b);
		boolean b1=hasBad("xbadxx");
		System.out.println(b1);
		boolean b2=hasBad("xsxbadxx");
		System.out.println(b2);
	}
	public static boolean hasBad(String s) {
		boolean flag = false;
		for(int i=0;i<2;i++) {
			if(s.substring(i,i+3).equals("bad")){
				flag = true;
				break;		
		}
	  }
		return flag;
	}
}


