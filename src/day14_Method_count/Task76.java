package day14_Method_count;

public class Task76 {

	public static void main(String[] args) {
		/*
		 *Write a method that accepts 2 numbers and return if they have the same last digit.
Sample Output 
		 */
		boolean b=lastDigit(7,17);//- >true 
		boolean b1=lastDigit(6,17);// - >false 
		boolean b2=lastDigit(3,113);// - >true
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
	}

	private static boolean lastDigit(int x, int y) {
	    String xx = ""+x;
	    String yy = ""+y;
	    System.out.println(xx);
	    System.out.println(yy);
	    boolean returnValue = false;
	    for(int i=0;i<xx.length();i++) {
	    if(xx.substring(xx.length() - 1) == yy.substring(yy.length() - 1)) {
	        returnValue = true;
	    }
	 
		

} 
	    return returnValue;
	}

}