package day30_Var_args_wrapper;

public class VarArg {

	public static void main(String[] args) {
		sum(2,4);
		sum(2,3,4,5);
		sum(4,54,57,45,343,24,9890);
		
		concat("apple","banana","orange","pinapple");
		
	}
//	public static void sum(int a ,int b) {
//	System.out.println(a+b);
	
	public static void sum(int... numbers) {
		int sum=0;
		
		for(int value: numbers) {
			sum+=value;
		
		}
		System.out.println(sum);
	
	}
	public static void concat(String...strs) {
		String nstr="";
		for(String str: strs) {
			nstr+=str.charAt(0);		
		}
		System.out.println(nstr);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
