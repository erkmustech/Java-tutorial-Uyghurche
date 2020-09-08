package day23_lab2;

public class Ques_11 {

	public static void main(String[] args) {
		/*
		 Return the number of times that the string "hi" appears anywhere in the given string. 
		 countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
		 */
		
		int s=countHi("ABChi hi");
		
	}

	private static int countHi(String s) {
		int i=0;
		for(int j=0;j<s.length();j++) {
		if(s.contains("hi")) {
			i++;
	    }
		}
		return i;
		
    }
}
