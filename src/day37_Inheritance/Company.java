package day37_Inheritance;

public class Company {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.department="sales";
		e1.salary=10000;
		e1.age=30;
		e1.name="tom";
		e1.gender='M';
		
		e1.salary();
		e1.wolk();
		
		System.out.println(e1.toString());
		
		
	}

}
