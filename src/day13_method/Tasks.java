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
		
		System.out.println("----59-----");
		
		payCalc(80,10);
		payCalc(24, 40);
		
		
		
	}

	private static void payCalc(double h,double p) {
		int hours;
		double pay=h*p;
		System.out.println(pay);
		
		
		System.out.println("---60----");
		calc(4,5,"+");
		calc(78,88,"*");
		calc(237283,87237723,"-");
		calc(73434,22838,"/");
		
		
		
		
	}

	private static void calc(double i, double j, String ope) {
		switch(ope) {
		case "+":
         System.out.println(i+j);
         break;
		case "-":
	         System.out.println(i-j);
	         break;
		case "*":
	         System.out.println(i*j);
	         break;
		case "/":
	         System.out.println(i/j);
	         break;
	         default:
	         System.out.println("invlaid operator");
		
	}
		
		System.out.println("------61-----");
		
		ageclc(1978, 2020);
		ageclc(1989);
		
			

}

	private static void ageclc(int i) {
		int cy=2020;
		int age=cy-i;
		System.out.println("your age is "+age);
		
	}

	private static void ageclc(int i,int j) {
		System.out.println("your age is "+(j-i));
			
	
	
	System.out.println("-----63-----");
	
	calci(12,21,19);
	}

	private static void calci(int i, int j, int k) {
		if(i>j&&i>k) {
			System.out.println("i is biggest");
		}if(j>i&&j>k) {
			System.out.println("j is biggest");
		}if(k>i&&k>j) {
			System.out.println("k is biggest");
		}
	}
}
		
		
	