package day35_encupsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employees e=new Employees();
		Employees e1=new Employees("mike smith", 287833);
		Employees e2=new Employees("John",829382323, "Account","Developer");
		
		e1.setName("mike smith");
		e2.setIDnum(748473);
		e2.setDepartment("sales");
		 
		System.out.println(e.getName()+"\t"+e.getIDnum()+"\t"+e.getDepartment()+"\t"+e.getPosition());
		System.out.println(e1.getName()+"\t"+e.getIDnum()+"\t"+e.getDepartment()+"\t"+e.getPosition());
		System.out.println(e2.getName()+"\t"+e.getIDnum()+"\t"+e.getDepartment()+"\t"+e.getPosition());

		
	}

}
