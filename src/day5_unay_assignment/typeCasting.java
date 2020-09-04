package day5_unay_assignment;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b;
		int i=81;
		double d=22323.389;
		float f=89.78f;
		char c='a';
		
		c=(char)i;  //explict casting 
		System.out.println("i ="+ i + " c = " +c);
		
		i=(int)d;
		System.out.println("d ="+d+" i = "+i );
		
		
		System.out.println("----mixed Integer----");
		
  /* 
		int + double = double 
	    int + float = float;
		short + int = int;
		shor + short = int;
		byte+byte=short:
		
		to get the oposit , we have to use casting -   (dataType)data
	*/
		

		

	}

}
