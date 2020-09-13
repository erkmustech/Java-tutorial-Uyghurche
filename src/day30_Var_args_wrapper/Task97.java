package day30_Var_args_wrapper;

public class Task97 {

	public static void main(String[] args) {
		String s="9)(8&we@l-9c/%om*32e3 t.o $j0av*a";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))|| s.charAt(i)==' ') {
				s1=s1+s.charAt(i);
				
			}
			
		}
		System.out.println(s1);
	}

}
