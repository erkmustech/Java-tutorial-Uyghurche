package day27_2d_arry;

import java.util.Arrays;

public class Langth {

	public static void main(String[] args) {
		int[][] nums= {
				{1,2},
				{2,3,4},
				{3,4,5,6},
				{0},
				{}
				
		};
		System.out.println(nums[2][3]);
		System.out.println("the rows of the array "+nums.length);
		System.out.println("the peoplw int he this row :"+nums[2].length);
		int count = 0;	
		for(int[] num:nums) {
			for(int s_num:num) {
			System.out.println(Arrays.toString(num));
			count++;
		}
			System.out.println();

			System.out.println("the total element of the arraylist : "+count);
			
			System.out.println("-----2-method ---");
			
			int[][] nums1= {
					{1,2},
					{2,3,4},
					{3,4,5,6},
					{0},
					{}
					
			};
			System.out.println("the rows of the array "+nums1.length);
			int count1 = 0;	
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<nums[i].length;j++){
				   System.out.print(nums[i][j]+", ");
				count1++;
			}
	
				
			}
			System.out.println();
			System.out.println("the total number of the nums1 : "+count1);
			
			
			
			
	}
		
		
  }
}


/*
	
*/