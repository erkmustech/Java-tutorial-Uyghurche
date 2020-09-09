package day25_arryList;

public class RetrunArray {

	public static void main(String[] args) {
		
		double[]values;
		values=getArray();
		
		for(double value:values) {
			System.out.println("value is"+value);
		}		
		
	} 
	public static double[] getArray() {
		double[] array= {1,2,3,4,56,7};
		return array;
	}

}
