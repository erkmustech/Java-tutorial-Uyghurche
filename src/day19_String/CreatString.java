package day19_String;

public class CreatString {

	public static void main(String[] args) {
//       string is a kind of class. String is created by two ways, 
//		1. literal  by "" symbles. if two string have smae content,in heap they are allocated together.
//		2. by new String keyword. in java memory is keep independent momory if they have same string content. 

		
		String str="apple";
		String str1=new String("apple");
		
		//string.length();
		
		System.out.println(str.length());
		
		//string.charAt();
		System.out.println(str1.charAt(1)); //index begin from 0
		
		//string.
		
		
	}

}
