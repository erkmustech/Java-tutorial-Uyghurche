package day15_method_overloading;

public class Task70 {

	public static void main(String[] args) {
		displayHighScore("max",highpositionScore(1500));
		
		
	}

	private static void displayHighScore(String name, int highpositionScore) {
		System.out.println(name +" is on the high positon with " +highpositionScore);		
	}

	private static int highpositionScore(int i) {
		int res = 0;
		if(i>1000) {
			res= 1;
		}if(i>500){
			res= 2;
		}if(i>50) {
			res= 3;
		}
		
		return res;
		
	}


}
