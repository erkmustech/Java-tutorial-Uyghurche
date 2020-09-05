package day13_method;

public class Tasks {

	public static void main(String[] args) {
		System.out.println("---56---");
	
		MKconverter();
		
	}

	private static void MKconverter() {
		double kd = 80;
		double md=kd*0.632;
		System.out.println(md);
		
		
		
		System.out.println("---57---");
		
		calculator3();
		
		
	}

	private static void calculator3() {
		int a=90;
		int b=80;
		int c=89;
		System.out.println(a+b+c);
		
		
		
		
		System.out.println("---58---");
		
		bignum();
			
	}

	private static void bignum() {
		int a=90;
		int b=89;
		if(a>b) {
			System.out.println("a is big");
		}else {
			System.out.println("b is big");
		}
		
	}
	

}
