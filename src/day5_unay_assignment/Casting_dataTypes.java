package day5_unay_assignment;

public class Casting_dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=127;
		byte b=-128;
		byte c=(byte) (a-b); //invalid , as the result is out of boundary of the byte 127 to -128;
		System.out.println(c);
		
		int c1=a-b;
		System.out.println(c1);
		
		int g=2938;
		double h = 1700000000;
		System.out.println(g*h);
		
		double u=h/g;
		System.out.println(u);
		
		float f=3.15f;
		int y=453;
		float r=y/f;
		
		System.out.println(r);
		
		int e=(int) (y/f);
		System.out.println(e);
		
		

	}

}
