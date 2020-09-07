package day20_string_manipulation;

public class Replace {

	public static void main(String[] args) {
		String s1=" javaScript ";
		
		System.out.println(s1.substring(s1.length()-4));
		
		String sen="programming is fun!";
		String n_sen=sen.substring(sen.length()-4);
		String sen1=sen.substring(0,11);
		System.out.println(n_sen);
		System.out.println(sen1);
		System.out.println(s1.toLowerCase());
		System.out.println(sen1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(sen.replace(" ", "|"));
		System.out.println(s1.replace(" ", "|"));
		
		String web= "amazon is best place to shopping";
		System.out.println(web);
		
		System.out.println(web.replaceAll("amazon", "ebey").replace("shopping", "online shopping"));
		
		
		String res="there are 923,000,000 result about the table";
		System.out.println(res);
		
		String res1=res.replace(res, res.subSequence(10, 21));
		String res2=res.replace(res, res.substring(10,21));
		System.out.println(res1);
		System.out.println(res2);
						
	}

}
