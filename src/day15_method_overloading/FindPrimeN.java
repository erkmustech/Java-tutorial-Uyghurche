package day15_method_overloading;

public class FindPrimeN {

	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			for(int j=2;j<=i;j++) {
				int primeN=i/j;
				if(primeN%j!=0) {
					System.out.println(i);
				}
			}
		}
	}

}
