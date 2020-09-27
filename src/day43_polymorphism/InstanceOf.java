package day43_polymorphism;

public class InstanceOf {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		
		if(dog instanceof Animal) {
			System.out.println("Animal");
		}else {
			System.out.println("not ");
		}
	}

}
