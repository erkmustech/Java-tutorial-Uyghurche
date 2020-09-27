package day44_errorHandling_exception;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
//			System.out.println(4/0);
			
			String str=null;
//			System.out.println(str.toUpperCase());
			
			int[] n= {10,4};
			System.out.println(n[2]);
			
		}catch(ArithmeticException e) {
			System.out.println("arthmetic exception happen");
			
		}catch(NullPointerException e) {
			System.out.println("Null pointe exception");
			
		}catch(RuntimeException e) {
			System.out.println("runtime exception"+e.getClass().getSimpleName());
		
		}
	}

}
