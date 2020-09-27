package day43_polymorphism;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal b=new Dog();
		Animal c=new Brid();
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Brid();
		
		
		
		
	}

}


class Animal{}
class Dog extends Animal{}
class Brid extends Animal{}
