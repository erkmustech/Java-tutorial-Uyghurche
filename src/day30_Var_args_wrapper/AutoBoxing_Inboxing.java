package day30_Var_args_wrapper;

public class AutoBoxing_Inboxing {

	public static void main(String[] args) {
		//auto boxing == primitive to object
			
		Integer num1=1234;
		int n=5;
		Integer num2=n;
		
		
		//un-boxing == object to primitive
		
		Double d1=new Double(34.5);
		double d2=d1;
		
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		
	}

}
