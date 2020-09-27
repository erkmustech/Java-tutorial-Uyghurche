package day44_errorHandling_exception;

public class RunTime_error {

	public static void main(String[] args) {
		
		//stackOverFlowError
		
		go();
	}
	public static void go() {
		System.out.println("going");
		go();
		
	}
	

}
