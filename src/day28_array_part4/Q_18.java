package day28_array_part4;

public class Q_18 {

	public static void main(String[] args) {
		int[]x= {1,12,13,5,4};
		System.out.println(sum(x));
		
	}
	public static int sum(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=13) {
			sum=sum+arr[i];
			}else {
				//sum=sum-arr[i+1];  13 and next to 13
				break; // 13 and all the number after 13
			}
		}
		return sum;
	}

}
