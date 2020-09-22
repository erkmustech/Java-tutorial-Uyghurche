package day38_inheritance2;

public class VehicleTest {

	public static void main(String[] args) {
		
//		int i=-3;
//		do {
//			i=i+3;
//		}while(i<10); 
//			System.out.println(i);
		
		
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