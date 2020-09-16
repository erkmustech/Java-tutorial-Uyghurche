package day35_encupsulation;

import java.util.Scanner;

public class RouletteTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("inter your p number");
		Roulette r= new Roulette(s.nextInt());
		
		while(r.getPocketColor().equalsIgnoreCase("invalid")) {
			System.out.println("enter your pocket number");
			r.setPocketNumber(s.nextInt());
		}
		
			System.out.println(r.getPocketColor());
			
		}
	
		
		
	}
		
		
