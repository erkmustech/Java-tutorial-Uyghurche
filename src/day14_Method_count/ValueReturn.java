package day14_Method_count;

public class ValueReturn {

	public static void main(String[] args) {
		
		sum(2,3);
		int r=sum(2,3);
		System.out.println(r*5); 
		
		
	}
	
	public static int sum(int num1, int num2) {
		int res=num1+num2;
		return res;
	}

}
