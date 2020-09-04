package day11_nested_loop;

public class Do_while_loop {

	public static void main(String[] args) {
		// do while loop , the code runs at least once , whether the condition is true or false
		
		int i=0;
		do {
			System.out.println(" hello wordl");
			i++;
			
		}while(i<5);
		
		System.out.println("-----53-----");
		
		int m=0;
		int sumE = 0;
		while(m<100) {
			if(m%2==0) {
				sumE=sumE+m;
				
			}
			m++;
	  }
		System.out.println(sumE);
   }
}
  