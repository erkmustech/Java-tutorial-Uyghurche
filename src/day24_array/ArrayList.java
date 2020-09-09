package day24_array;

public class ArrayList {

	public static void main(String[] args) {
	     int sum=0;
		
		int[] scores= {90,77,56,98,100,65,73,69,68,89,20,31,69,93,29};
		for(int i=0;i< scores.length;i++) {
		sum=sum+scores[i];
		
		}
		
		System.out.println("the lenght of the elements is: "+scores.length);
		System.out.println("the sum of the all elements is "+ sum);
		System.out.println("the avrage of the elements is : "+sum/scores.length);
	}

}


