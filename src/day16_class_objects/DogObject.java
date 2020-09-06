package day16_class_objects;

public class DogObject {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		
		dog1.age=3;
		dog1.name="max";
		dog1.color="white";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed); //dufault null. defulat int =0; default boolean=false
		
		dog1.barking();
		dog1.sleeping();
		dog1.eating();
		
	}

}
