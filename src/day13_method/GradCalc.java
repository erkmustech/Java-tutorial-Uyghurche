package day13_method;

public class GradCalc {

	public static void main(String[] args) {
		gradeCal(89,98,83);
		gradeCal(76, 38, 19);
		gradeCal(39, 90, 53);
		gradeCal(90, 100, 50);
	}

	private static void gradeCal(int i, int j, int k) {
		double avarage=(i+j+k)/3;
		if(avarage>=90 && avarage<=100) {
			System.out.println(" your avarage score is "+avarage+"and your grade is A");
		}
		if(avarage>=80 && avarage<90) {
			System.out.println(" your avarage score is "+avarage+"and your grade is B");
		}
		if(avarage>=70 && avarage<80) {
			System.out.println(" your avarage score is "+avarage+"and your grade is C");
		}
		if(avarage>=60 && avarage<70) {
			System.out.println(" your avarage score is "+avarage+"and your grade is E");
		}
		if(avarage>=0 && avarage<60) {
			System.out.println(" your avarage score is "+avarage+"and your grade is F");
		}
		
	}

}
