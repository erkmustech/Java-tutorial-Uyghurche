package day28_array_part4;

public class Q_19 {

	public static void main(String[] args) {
	
		int[]x= {1,2,6,1,2,7,1};
		System.out.println(sum(x));
		
	}
	public static int sum(int[]arr) {
		int sum=0;
		int sum1=0;
	
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]!=6||arr[i]!=7) {
			 sum=sum+arr[i];
			 }
		 
			 if(arr[i]==6) {
				 for(int j=arr[i];j<arr.length-1;j++) {
			     sum=sum-arr[j+1];
			     if(arr[j]==7) { 
				 break;
			 }
			
		   }
			 }

	

   } 
		 return sum-sum1;
	}
}