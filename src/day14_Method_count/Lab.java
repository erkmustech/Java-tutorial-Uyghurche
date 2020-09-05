package day14_Method_count;

public class Lab {

	public static void main(String[] args) {
		System.out.println("----Question-1----");
		/*
		 Lab-1
Question-1

Write a method that accepts a string and a non-negative number, and prints a larger string that is number 
copies of the original String

stringTimes("Hi", 2); = > HiHi
stringTimes("Hi", 3); = > HiHiHi
stringTimes("Hi", 1); = > Hi
*/
		
		stringTimes("hi",5);
		stringTimes("love", 5); 
	}

	private static void stringTimes(String string, int n) {
			String str="";
			for(int i=0;i<n;i++){
			str=str+string;
			}
			System.out.println(str);
			
		
		System.out.println("----Question-2----");
		
		/*

Question-2

The number 6 is a truly great number. Write a method that accepts num1 and num2, prints true if either 
one is 6. Or if their sum or difference is 6.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
love6(12, 6); ->true
*/
		love6(12,18);
		love6(6, 4);
		love6(4, 5);
		love6(1, 5);
		love6(12, 6);
	}

	private static void love6(int i, int j) {
		if(i==6 || j==6 ||(i+j)==6 ||(i-j)==6||(j-i)==6) {
			System.out.println(" true");
		}else {
			System.out.println("no great num");
		}
		
		System.out.println( );
		System.out.println("----Question-3----");
		
		/*

Question-3

We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Write a
 method that accepts a number and prints true if the given number is special.

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
*/
	specialnum(17811);
	specialnum(22);
	specialnum(34);

	}

	private static void specialnum(int i) {
		if(i%11==0 || i%11==1) {
			System.out.println("speical num");
		}else {
			System.out.println("no special ");
		}
		
		System.out.println( );
		System.out.println("----Question-4----");

		
		/*

Question-4

The deers in VA spend most of the day playing. In particular, they play if the temperature is between 60 
and 90. Unless it is summer, then the upper limit is 100 instead of 90.
Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.
*/

deerPlay(70, false);// true
deerPlay(95, false); // false
deerPlay(95, true); // true

	}

	private static void deerPlay(int i, boolean isSummer) {
		if(isSummer) {
		if(i <100 && i>60) {
			System.out.println(true);
				
			}
			
		}else {
			if(i<90&&i>60) {
				System.out.println(true);
			}
		}
		
		
		
		
		/*

Question-5

You are driving a little too fast, and a police officer stops you. Write a method to compute the result:
 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between
  61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday
   -- on that day, your speed can be 5 higher in all cases.

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0

Question-6

When chipmonks get together for a party, they like to have cigars. A chipmonk party is successfull when the 
number of cigars is between 40 and 60. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Write a method that accepts number of cigars and a boolean for weekend, and prints true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
		 */

		

		

	}

}
