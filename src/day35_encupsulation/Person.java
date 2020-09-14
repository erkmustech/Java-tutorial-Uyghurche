package day35_encupsulation;

public class Person {
	public String name;
	private int age=20;
	private char gender;
	
	
	public void setAge() {
		if(age>0) {
			this.age=age;
		}
	}
	
	public int getAge(int age) {
		return age; 
	}
	

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void print() {
		System.out.println("his name is : "+name+" and he is "+age+"gender is "+gender);
	}
	
}
