package day24_array;

public class Task_90 {

	public static void main(String[] args) {
		String[] cars= {"TOYOTA","BMW","Honda","GM","Ferarry"};
		boolean flag = false;
		for(int i=0;i<cars.length;i++) {
			if(cars[i].equals("Honda")) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("fond it");
		}else {
			System.out.println("not fond it");
		}
	}

}
