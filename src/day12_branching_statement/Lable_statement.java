package day12_branching_statement;

public class Lable_statement {
	public static void main(String[] args) {
		
		int i=0;
		outer: 
			do {
				i=8;
				inner:
				while(true) {
					System.out.println(i--);
					if(i==4) {
						break outer;
					}
				}
					
	     	}while(true);
			
		
		
	}

}
