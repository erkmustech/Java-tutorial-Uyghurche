package day44_errorHandling_exception;

public class Try_catch {
	public static void main(String[] args) {
		
		try {
			
			String str="java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));
			System.out.println(str.charAt(1));
			
		}catch(Exception e) {
			
			System.out.println("Exception happened in try block and was caught");
	

	}
 }
}

