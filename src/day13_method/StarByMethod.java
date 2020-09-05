package day13_method;

public class StarByMethod {

	public static void main(String[] args) {
		System.out.println("---------65--------");
		/*
		 	*
			**
			***
			****
			*****
		 */
		
		star(5);
		
	}

	private static void star(int s) {
		for(int i=0;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
