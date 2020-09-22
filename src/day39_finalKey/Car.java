package day39_finalKey;

public class Car extends Vehicle {
	
	private int wheels;
	private int doors;
	private int years;
	private boolean isManual;
	private int currentGrear;
	
	public Car(String brand, String make, int currantVelocity, int currentDirection, int wheels, int doors, int years,
			boolean isManual) {
		super(brand, make, currantVelocity, currentDirection);
		this.wheels = wheels;
		this.doors = doors;
		this.years = years;
		this.isManual = isManual;
	}
	
	public void changeGear(int currentGear) {
		this.currentGrear=currentGear;
		System.out.println("car.change grear :"+this.currentGrear+"gear");
		
	   }
	
	public void changeVelocity(int speed,int direction) {
		move(speed,direction);
		System.out.println("car.chagevelocity : "+speed+"direction"+ direction);
		
	
		
   }

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", doors=" + doors + ", years=" + years + ", isManual=" + isManual
				+ ", currentGrear=" + currentGrear + "]";
	}

}
