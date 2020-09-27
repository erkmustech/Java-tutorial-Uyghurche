package day44_errorHandling_exception;

public class Try_catch2 {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,5};
		
		 // compile time error
		
	//	System.out.println(nums{0]);
		
		
		// run time exception 
		
		try {
			System.out.println(nums[6]);
		}catch(Exception e) {
			System.out.println("wrong index");
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		// arithmetic exception  exception 
		//  getMessage();
		// printStackTrace();
		
		try {
			int j=100;
			int n=j/0;
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException happened");
			System.out.println(e.getMessage());
			
		}
	}

}
