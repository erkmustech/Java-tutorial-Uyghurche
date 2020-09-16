package day35_encupsulation;

public class Employees {
	
	private String name;
	private int IDnum;
	private String department;
	private String position;
	
	public Employees() {
		
		IDnum=0;
		name="";
		department="";
		position="";
		
	}
	
	public Employees(String name, int IDNum) {
		
		this.name = name;
		this.IDnum = 0;
		department="";
		position="";
		
	}
	
	public Employees(String name, int iDnum, String department, String position) {
		this.name = name;
		IDnum = iDnum;
		this.department = department;
		this.position = position;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIDnum() {
		return IDnum;
	}

	public void setIDnum(int iDnum) {
		IDnum = iDnum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	

}
