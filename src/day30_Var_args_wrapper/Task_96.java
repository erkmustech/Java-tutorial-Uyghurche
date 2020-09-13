package day30_Var_args_wrapper;

public class Task_96 {
	public static void main(String[] args) {
		
		double degreeF;
		double  degreeC;
		
		
		String str="Today weathe is sunny and 82 degree.it is perfact day!";
		String[]arr=str.split("and ");
		String s=arr[1].split(" degree")[0];
//		System.out.println(s);
		
		//time to parce str
		
		degreeF=Double.parseDouble(s);
		degreeC=(degreeF-31)*5/9;
		
		System.out.println(degreeF+" degree is equal to "+Math.round(degreeC)+" celcius");
		

		
		
	}

}
