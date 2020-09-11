package day28_array_part4;

public class Q_16 {

	public static void main(String[] args) {
		int[]x= {2,1,3,4,8};
		
		System.out.println("the number of even number : "+EvenNum(x));
		
	}
	public static int EvenNum(int[]arr) {
		int count=0;
		for(int Even:arr) {
			if(Even%2==0) {
			count++;
		}
		
		}
		return count;
	}

}
