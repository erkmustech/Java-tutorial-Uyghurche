package day34_Constructors_Encupsulation;

public class CarpetTest {

	public static void main(String[] args) {
			Calculator c1=new Calculator(new Floor(10.8, 12.8),new Carpet(8));
			System.out.println(c1.getTotalCost());
		
		
		Floor f1=new Floor(10, 12);
		Carpet cr1=new Carpet(8);
		Calculator c2=new Calculator(f1,cr1);
		System.out.println(c2.getTotalCost());
		
	}
}
