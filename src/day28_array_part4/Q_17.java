package day28_array_part4;

public class Q_17 {

	public static void main(String[] args) {
		int[]x= {10,2,5,8,29};
		System.out.println(diffValue(x));
		
	}
	
	public static int diffValue(int[]arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			max=arr[i];
			
		}
		
	}
		int min=max;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
			min=arr[i];
			
		}
		
	}
		return max-min;
}
}
