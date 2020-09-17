package day38_inheritance2;

public class Company {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		FullTimeEmployee fe=new FullTimeEmployee();
		Contractor ce=new Contractor();
		
		e.calculatePay(40, 40);
		fe.calculatePay(40, 40);
		ce.calculatePay(40, 40);
		
		
		
	}

}
