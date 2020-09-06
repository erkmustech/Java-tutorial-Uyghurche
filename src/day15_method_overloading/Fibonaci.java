package day15_method_overloading;

public class Fibonaci {

	public static void main(String[] args) {
		// fibonaci is famous wraping example and mostly used in agile envirnment.
		
		int count=40;
		int pre1=0,pre2=1;
		System.out.println("fibonacci serious of "+count+" numbers");
		
	
		
		for(int i=1;i<count;i++) {
			
			
			int sumOfPre2=pre1+pre2;
			pre1=pre2;
			pre2=sumOfPre2;
			System.out.println(sumOfPre2);
		}

	}

	
}
