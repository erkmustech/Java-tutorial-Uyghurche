package day38_inheritance2;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.display();
		
		
	}

}

class Vehicle{
	int maxS=120;
	
}

class Car extends Vehicle{
	int maxS=180;
	void display(){
		System.out.println("max s is"+super.maxS);
		System.out.println("maxium speed is "+maxS);
	}
}