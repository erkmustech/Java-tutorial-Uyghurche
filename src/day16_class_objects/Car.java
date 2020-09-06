package day16_class_objects;

public class Car {
	
	String make;
	String color;
	int year;
	String model;
	int cs;
	
	public void printCarinfo() {
		String info="Car make["+make+"],model["+model+"],color["+color+"]"; 
		
		System.out.println(info);
	}
	
	public void driver() {
		System.out.println(make+ " "+model+" is driving");
	}
	
	public void accilerate(int mph) {
		cs=cs+mph;
		System.out.println("car is running at the speed :"+cs);
	}

}
