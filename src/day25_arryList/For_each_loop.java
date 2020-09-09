package day25_arryList;

import java.util.Random;

public class For_each_loop {

	public static void main(String[] args) {
		
		Random r=new Random();
		
		int[] scores= {90,77,56,98,100,65,73,69,68,89,20,31,69,93,29};
		
		String[] cars= {"TOYOTA","BMW","Honda","GM","Ferarry"};
		
		for(int score:scores) {
			System.out.println(score);
		}
		for(String car:cars) {
			int price=r.nextInt(20000-10000)+1+10000;
			System.out.println(car+"price: "+price);
		}
	}

}
