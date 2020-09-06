package day16_class_objects;

public class CarObject {

	public static void main(String[] args) {
		Car car1=new Car();
		
		car1.color="red";
		car1.make="Ford";
		car1.model="fietsw";
				
	   car1.accilerate(100);
		car1.printCarinfo();
	}

}
