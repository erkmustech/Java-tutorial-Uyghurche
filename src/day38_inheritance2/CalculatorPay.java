package day38_inheritance2;

public class CalculatorPay extends Employee{
	
	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours * rate) + 200;
		System.out.println("Contractor total pay:" + total);
	}

}
