package day23_lab2;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		
		
	boolean flag;
	int n=8;
	do {	
		Random r=new Random();

		System.out.println("please guess the lucky num");
		int random=r.nextInt(10);
		System.out.println(random); 
		if(random==n) {
			System.out.println("you find lucky number");
			flag=true;
			break;
		}else {
			System.out.println("please try again");
			flag=false;
		}
	}while(flag=true);
	}
	

}
