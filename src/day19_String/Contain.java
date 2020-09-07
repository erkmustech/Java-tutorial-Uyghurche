package day19_String;

import java.util.Scanner;

public class Contain {

	public static void main(String[] args) {
		String mail="johnbrid_demrox@icloud.com";
		boolean b=mail.contains("@");
		System.out.println(b);
		
		String list="apple, dell, asus, acer, toshiba, hp, sony";
		
		Scanner s=new Scanner(System.in);
		System.out.println("inter the listed leptop brand");
		
		for(int i=0;i<10;i++) {
		String list1=s.nextLine();
		
		if(list1.contains("apple")) {
			System.out.println("the list illegibale");
		}else if(list1.contains("leveno")) {
			System.out.println( "unothorized list");
		}else {
			System.out.println("make the list again");
		}
	}

}
}
