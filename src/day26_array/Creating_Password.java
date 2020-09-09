package day26_array;

import java.util.Arrays;

public class Creating_Password {

	public static void main(String[] args) {
		/*
		 String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		Create a password based on given info. Output: CD132G00ABC!
		 */
		
		String s="xxxCD132Gxxx";
		String s1="xxx00ABC!xxx";
		
		String[] s2=s.split("xxx");
		System.out.println(Arrays.toString(s2));	
		String[] s3=s2[1].split("x");
		String s5=s3[0];
		System.out.println("s5 is "+s5);
		
		
//		String[] s6=s1.split("x");
//		System.out.println("s6 length is "+s6.length);
//		System.out.println(Arrays.toString(s6));
//		String s7=s6[3];
//		System.out.println(s7);

		
		String s6=(s1.split("xxx")[1]);
		System.out.println("s6 is "+s6);
		
		String ss=s5.concat(s6);
		System.out.println("the new formed password is "+ss);	
		
		

		
	}

}
