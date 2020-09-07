package day19_String;

public class Task79 {
	public static void main(String[] args) {
		String word="fightforFreedom";
		String vowel="aeoiu";
		String out="";
		
		
		for(int i=0;i<word.length();i++) {
			for(int j=0;j<vowel.length();j++) {
				if(word.charAt(i)==vowel.charAt(j)) {
				out=out+word.charAt(i)+",";	
				}
			}
			
		}
		System.out.println(out);
	}

}
