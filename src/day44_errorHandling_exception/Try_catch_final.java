package day44_errorHandling_exception;

public class Try_catch_final {

	public static void main(String[] args) {
		
		String str="selenium";
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter corrat index");
			return;
		}finally {
			System.out.println("finally block");
		}
		
		System.out.println("everything is over");
	}

}
