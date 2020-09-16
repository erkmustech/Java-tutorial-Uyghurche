package day36_Inheritance;

public class Employee extends Person{
	
	String department;
	int salary;
	
	public void work() {
		System.out.println(name+ " is working in "+department);
	}
	
	public void salary() {
		System.out.println(name+" 's salary is "+salary);
}


	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}

	

}
