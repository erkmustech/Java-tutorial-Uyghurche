package day39_finalKey;

public class Vehicle {
	private String brand;
	private String make;
	private int currantVelocity;
	private int currentDirection;
	
	
	
	
	public Vehicle(String brand, String make, int currantVelocity, int currentDirection) {
		
		this.brand = brand;
		this.make = make;
		this.currantVelocity = currantVelocity;
		this.currentDirection = currentDirection;
		
		
	}

	public void steer(int direction) {
		currentDirection+=direction;
		System.out.println("vehilce/steer(): Steering at "+currentDirection+"degrees");
		
	}
	public void move(int velocity,int direction) {
		currantVelocity=currantVelocity+velocity;
		currentDirection=currentDirection+direction;
		System.out.println(currantVelocity);
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getCurrantVelocity() {
		return currantVelocity;
	}
	public void setCurrantVelocity(int currantVelocity) {
		this.currantVelocity = currantVelocity;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	

}
