package day10_controlFlowStatement;

public class Debagging {

	public static void main(String[] args) {
		/*1. toglle the start point. 
		2. press the debugging icon 
		3. press step into(not step over) for next step
*/
		int sumOdd = 0;
		int sumEven = 0;
		for(int h=1;h<100;h++) {
			if(h%2==0) {
				sumEven=sumEven+h;
			}else {
				sumOdd=sumOdd+h;
			}
		}
		System.out.println("the sum of even number is "+sumEven);
		System.out.println("the sum of odd numbe ris "+ sumOdd);
		
	}

}
