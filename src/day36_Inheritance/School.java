package day36_Inheritance;

public class School {

	public static void main(String[] args) {
		
		Person p=new Person();
		Student s=new Student();
		Employee e=new Employee();
		
		
		
		p.name="max";
		p.age=30;
		p.gender='m';
		s.major="Account";
		s.sudentID=28237;
		e.salary=90000;
		s.name="Furkan";
		
		p.eat();
		s.attendClass();
		e.salary();
		
		
		
		System.out.println(p.toString());
		
		
		
		
		
	}

}
