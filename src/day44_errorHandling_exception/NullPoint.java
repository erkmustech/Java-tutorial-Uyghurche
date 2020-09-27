package day44_errorHandling_exception;

public class NullPoint {
	
	//Nullpoit exception

		static String name;
		
	public static void main(String[] args) {
		
//		System.out.println(name.toUpperCase());
		
		try {
			System.out.println(name.toUpperCase());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
