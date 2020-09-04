package day6_logical_operator;

public class OperatorPrecedence {

	public static void main(String[] args) {
		
		System.out.println("--task 1---");
		
		int applesCount=20;
		int orangeCount=31;
		int persCount=30;
		
		boolean comp= applesCount<orangeCount||orangeCount<persCount;
		boolean comp1= applesCount<orangeCount && orangeCount<persCount;
		
		System.out.println(comp);
		System.out.println(comp1);
		
		
		System.out.println("--task 2---");
		
		int b=2;
		boolean res= ++b ==2 || --b == 2 && --b ==2;
		System.out.println(res);
		
		System.out.println("b = "+b);
		
		
		System.out.println("--task 3---");
		
		double d=20;
		double d1=80;
		double d2=(d+d1)*25;
		System.out.println(d2);
		double r = d2%40;
	
		System.out.println(r<=20);
		
		boolean h=2600%40==0;
		System.out.println(h);
		
		boolean t=d2%40==20 || d2%40<20;
		System.out.println(t);
		
		System.out.println(2500/40);
		

	}

}
