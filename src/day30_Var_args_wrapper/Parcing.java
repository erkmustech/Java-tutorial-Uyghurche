package day30_Var_args_wrapper;

public class Parcing {

	public static void main(String[] args) {
		
		String numAsString="2018";
		System.out.println(numAsString);
		
		numAsString+=1;
		System.out.println(numAsString);
		
		int num=Integer.parseInt(numAsString);
		System.out.println(num);
		
		
		num+=1;
		
		System.out.println(num);
		
		int i=10;
		String s=String.valueOf(i);
		System.out.println(i);
		System.out.println(s);
		i++;
		s=s+1;
		System.out.println(i);
		System.out.println(s);
		
	}

}
