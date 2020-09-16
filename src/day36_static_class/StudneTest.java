package day36_static_class;

public class StudneTest {

	public static void main(String[] args) {
		
		Student s= new Student("Furkan", 3, 999, "Furkan Universtiy");
		Student s1= new Student("Erk", 4, 999, "Furkan Universtiy");
		Student s2= new Student("Sayfu", 10, 999, "Furkan Universtiy");
		
		System.out.println(s.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
