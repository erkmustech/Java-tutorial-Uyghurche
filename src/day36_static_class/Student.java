package day36_static_class;

public class Student {
	String name;
	int age;
	int IDnum;
	String school;
	
	
	public Student(String name, int age, int iDnum, String school) {
		this.name = name;
		this.age = age;
		this.IDnum = iDnum;
		this.school = school;
	}


	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", IDnum=" + IDnum + ", school=" + school + "]";
	}
	
	
	
	
}
