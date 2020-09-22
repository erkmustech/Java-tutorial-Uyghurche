package day39_finalKey;

public class FinalMethod {
	
	public final void method1() {
		System.out.println("method1");
	}
	public static void staticMethod(String word) {
		System.out.println("static method");
	}

}


class Sub extends FinalMethod{
	
//	@Override
//	public void method1() {  // final method cann't be overrided
//		System.out.println("method1 from sub class");
//	}
	
	public static void staticMethod(String word) {
		System.out.println("static method in sub class");
	}
}
