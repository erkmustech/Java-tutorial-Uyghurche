package day14_Method_count;

public class DeerPlay {

	public static void main(String[] args) {
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
					}else {
						System.out.println(false);
					}
					
				}else {
					if(i<90&&i>60) {
						System.out.println(true);
					}else {
						System.out.println(false);
					}
				}
				
				
				
	}

}
