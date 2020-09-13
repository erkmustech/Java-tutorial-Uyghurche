package day31_Array_list;

import java.util.Arrays;

public class Task98 {

	public static void main(String[] args) {
		
		/*
		 Change the implementation of decodeTheCode(String) method such that on executing class, following output
		  is shown:
		 
		1256 
		934
		 */
		
		String s="Tw9o2 /3thr*(ee 98(0f9iv-e s0i2976%9x se7v(e00n ";
		
		System.out.println(decode(s));
		
		
		
	}
	public static String decode(String s) {
		String s2="";
		
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' ') {
				s2=s2+s.charAt(i);
			
			}
		}
		System.out.println(s2);
		
		String[] arr=s2.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		String s3="";
		for(String value: arr) {
			s3=s3+getDigit(value)+" ";
			
		}
		return s3;	

	}
	public static String getDigit(String st) {
		
		switch(st.toUpperCase()) {
		case "ZERO":
			return "0";
		case "ONE":
			return "1";
		case "TWO":
			return "2";
		case "THREE":
			return "3";
		case "FOUR":
			return "4";
		case "FIVE":
			return "5";
		case "SIX":
			return "6";
		case "SEVEN":
			return "7";
		default:
		    return " ";
		}

	}
}
