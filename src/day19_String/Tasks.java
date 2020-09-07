package day19_String;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
//		System.out.println(" --- task 75---");
//		
//		Scanner s=new Scanner(System.in);
//		System.out.println("inter your firs tname");
//		String first_name=s.nextLine();
//		System.out.println("inter you last name");
//		String last_name=s.nextLine();
//		int length=(first_name.length())+(last_name.length());
//		System.out.println(length);
		
		System.out.println(" --- task 76---");
		
		String word="bilgisayar";
		char cha=word.charAt(word.length()-1);
		System.out.println(cha);
		System.out.println(" --- task 76---");
		for(int i=0;i<word.length();i++) {
			System.out.print(word.charAt(i)+", ");
			
		}
		
		System.out.println(" --- task 77---");
		
		String emoji=":)";
		char c=':';
		char d=emoji.charAt(1);
		if(emoji.length()==2) {
			if(emoji.charAt(1)==')')
			System.out.println("invalid");
			return;
		}else {
			System.out.println("no");
		}
		
		
		
	}

}
 