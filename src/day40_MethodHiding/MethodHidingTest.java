package day40_MethodHiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		
		
		
		
		
		
	}

}


class Bear{
	public static void eat() {
		System.out.println("bear is eating");
	}
	public static void sneeze() {
		System.out.println("bear is sneezing");
	}

}


class Panda extends Bear{
	public static void eat() {
		System.out.println("panda is eating");
	}
	public static void sneeze() {
		System.out.println("Panda is sneezing");
	}
}