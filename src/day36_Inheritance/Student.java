package day36_Inheritance;

public class Student extends Person{
	
	GradeActivity g=new GradeActivity();
	
	

	String univesity;
	String major;
	int sudentID;
	
	public void code(String lang) {
		System.out.println(name+ " is atteding coding class");
		
	}
	public void attendClass() {
		System.out.println(name+ "is atteding "+major+" class");
	}
	
}
