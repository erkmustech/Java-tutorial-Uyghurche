package day19_String;

public class Task78 {
	public static void main(String[] args) {
		String word="abcabqcabc";
		char myChar='a';
		int count=0;
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==myChar) {
				count++;
			}
		}
		System.out.println(myChar +" is repeated "+count+" times");
	}

}
