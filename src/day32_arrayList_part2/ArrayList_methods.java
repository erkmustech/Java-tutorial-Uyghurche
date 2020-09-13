package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList_methods {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
	
		
		al.add("U");
		al.add("NL");
		al.add("Fr");
		al.add("CHN");
		al.add("Tr");
		
		System.out.println(al.toString());
		System.out.println(al.contains("NL"));
		
		google(15);
		System.out.print(getList(10));
		
	}
	public static ArrayList<Integer> getList(int size){
		
		ArrayList<Integer> nl=new ArrayList<>(100);
		Random r=new Random(1);
		for(int i=0;i<size;i++) {
			int rn=r.nextInt();
			if(rn%2==0) {
			nl.add(rn);
		} 
	

	}
		return nl;

	}
	public static void google(int i) {
		  
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i1 = 0; i1 < targetStringLength; i1++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);


		
	}

}
