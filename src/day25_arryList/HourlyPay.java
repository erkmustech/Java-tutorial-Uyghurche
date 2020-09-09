package day25_arryList;

import java.util.Scanner;

public class HourlyPay {

	public static void main(String[] args) {
		final int employe=5;
		double pay;
		double grossPay;
		
		Scanner s=new Scanner(System.in);
		
		int[] hours=new int[employe];
		System.out.println("enter the hourse wokrdd by "+employe);
		
		for(int i=0;i<=5-1;i++) {
		hours[i]=s.nextInt();
		}
		System.out.println(hours[employe]);
		
		System.out.println("inter the pay for hour");
		System.out.println("the employes' salary is :"+(hours[employe]*20));
		
		
	}

}
