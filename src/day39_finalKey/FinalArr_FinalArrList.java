package day39_finalKey;

import java.util.ArrayList;

public class FinalArr_FinalArrList {

	public static void main(String[] args) {
			
		int[] scores= {90,89,48,90};
		scores=new int[7];
		
		final int[] scores1= {90,89,48,90};
//		scores1=new int[7];  // in final , it is not allowed to reference another array
		
		
		ArrayList<String> names=new ArrayList<>();
		names=new ArrayList<>(10);
		
		final ArrayList<String> names1=new ArrayList<>();
//		names1=new ArrayList<>(10);  //same as array rules
		
		
	}

}
