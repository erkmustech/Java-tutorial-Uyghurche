package day20_string_manipulation;

public class IndexOx {

	public static void main(String[] args) {
		String url="www.amazon.com";
		
		System.out.println("the . of the url is "+ url.indexOf("."));
		System.out.println(url.indexOf('m'));
		System.out.println(url.indexOf("com"));
		char c=(char) url.indexOf(5);
		System.out.println(url.indexOf(c));
				
	}

}
