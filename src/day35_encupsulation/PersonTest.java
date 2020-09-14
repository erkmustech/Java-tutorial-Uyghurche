package day35_encupsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p=new Person();
		
		p.name="mike";
		
		p.getAge(20);
		p.setGender('M');
		
		p.print();
		
	
		
	}

}
