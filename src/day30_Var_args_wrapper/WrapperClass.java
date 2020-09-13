package day30_Var_args_wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		int n1=10;
		Integer n2=new Integer(10);
		System.out.println(n1);
		System.out.println(n2);
		
		
		double d=4.5;
		Double d2=new Double(4.5);
		Double d3=new Double("4.5");
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		
		byte b=100;
		Byte b1=new Byte((byte) 100);
		System.out.println(b);
		System.out.println(b1);
		
		
		Boolean bo1=Boolean.valueOf(true);
		System.out.println(bo1);
		
		Integer in1=Integer.valueOf(331);
		System.out.println(in1);
		
									
	}

}
