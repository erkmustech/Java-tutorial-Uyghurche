package day18_input;

import java.util.Scanner;

public class Task73 {

	public static void main(String[] args) {
		
		int scnum=7;
		int userinput;
		Scanner sn=new Scanner(System.in);
		System.out.println("please the secret number between 1 to 14");
		
		do {
			userinput=sn.nextInt();
			if(userinput>scnum) {
				System.out.println("please inter smaller num");
			}else if(userinput<scnum) {
				System.out.println("please inter bigger numer");
			}else {
				System.out.println("you find sc numer");
			}
		}while(userinput!=scnum);
			
		}

	}

