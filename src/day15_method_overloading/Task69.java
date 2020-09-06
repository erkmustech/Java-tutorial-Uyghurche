package day15_method_overloading;

public class Task69 {

	public static void main(String[] args) {
		/*
		 *A prime number is a number that is evenly divisible only by itself and 1. For example, 
		 *the number 5 is prime number because it can be evenly divided only by 1 and 5. The number 6, 
		 *however, is not prime number because it can be divided evenly by 1,2,3,and 6.
Write a method named isPrime which takes an integer as an argument and returns true if the argument is a 
prime number, or false otherwise.
• Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers 
can be divided by 2.
		 */
		int num=89;
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
			
		}else {
			System.out.println(num+" is not prime number");
		}

		
		
	}

	private static boolean isPrime(int i) {
		boolean flag=true;
		if(i==2||i==1||i==3) {
			flag=true;
		}else {
		  for(int n=2;n<i;n++) {
		      if(i%n==0) {
			    flag= false;

		}
		    
	  }
	}
		return flag;
  }
}



