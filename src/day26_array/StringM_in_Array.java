package day26_array;

public class StringM_in_Array {

	public static void main(String[] args) {
		String[] cars= {"Honda","Sony","GM","BMW"};
		System.out.println(cars[1].length());
		System.out.println(cars[2].charAt(0));
		System.out.println(cars[0].substring(cars[1].length()-3));
		
	}

}
