package day23_lab2;

import java.util.Random;
import java.util.Scanner;

public class RamdomClass {

	public static void main(String[] args) {
//		Random rn=new Random();
//		System.out.println(rn.nextInt(45)+5); //iwanto find from 5 to 50
//		System.out.println(rn.nextDouble());
//		System.out.println(rn.nextBoolean());
//		System.out.println(rn.toString());
		
		int num1;
		int num2;
		
		int sum;
		int useAnser;
		
		Scanner sc=new Scanner(System.in);
		
		Random r=new Random();
		
		num1=r.nextInt(100);
		num2=r.nextInt(100);
		
		System.out.println("what is unswer of this problam?");
		System.out.println(num1+"+"+num2+"=?");
		
		useAnser=sc.nextInt();
		
		sum=num1+num2;
		
		if(useAnser==sum) {
			System.out.println("corract!");
		}else {
			System.out.println("wrong unswer, the corract unwser is: "+sum);
		}
		
		
	}

}
