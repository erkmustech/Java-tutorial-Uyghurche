package day36_static_class;

public class Campus {
	
	private String city;
	static String country;
	
	static {
		System.out.println("Static block");
		country="usa";
		
	}
	public Campus(String city) {
		System.out.println(" constructore");
		this.city=city;
		
		
	}
	static {
		System.out.println("static block 2");
		country="UK";
	}


}
