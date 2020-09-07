package day20_string_manipulation;

public class Task81 {

	public static void main(String[] args) {
		
		String st= "10/10/2020 14:25:00";
		System.out.println(timeStamp(st));
		
	}

	private static String timeStamp(String t) {
		t=t.replace("/", "").replace(":", "").replace(" ", "");
		return t;
		
	}

}
