package day44_errorHandling_exception;

public class BadArray {

	public static void main(String[] args) {
		
		//IndexOutOfBoundsException
	try {	
			
		int[] num= {1,2,4};
		for(int i=0;i<=num.length;i++) {
			System.out.println(num[i]);
		}
	}
	catch(Exception e){
		// code stop here and don't move forward
		
		System.out.println("IndexOutOfBoundsException");
	}
	}

}
