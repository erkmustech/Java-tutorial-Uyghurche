package day44_errorHandling_exception;

public class Throw_and_Throws {

	public static void main(String[] args)  {
		
		System.out.println("hellow world");
		
		throw new RuntimeException("this is thrown keword");
		
//		throw new Exception();
		
	}
	public void go() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("go");
	}

}

