package day35_encupsulation;

public class Employee {
	
	private String name;
	private int IDnum;
	private String department;
	private String position;
	
	public Employee() {
		
		IDnum=0;
		name="";
		department="";
		position="";
		
	}
	
	public Employee(String name, String department) {
		
		this.name = name;
		this.department = department;
		department="";
		position="";
		
	}
	
	public Employee(String name, int iDnum, String department, String position) {
		this.name = name;
		IDnum = iDnum;
		this.department = department;
		this.position = position;
		
		
	}
	
	
}
