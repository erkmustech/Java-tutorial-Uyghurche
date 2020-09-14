package day06_logical_operator;

public class Increament_decrement {

	public static void main(String[] args) {
		// pro and post 
		
		int a=2;
		System.out.println("a = "+a);
		int b=a++; //b=a+1
		System.out.println("a = "+a+ " , b = "+b);
		int c= ++a;  
		System.out.println("a = "+a+ " , b = "+b+ " c = "+c);
		
		
		int i1 =+10;
		int i2=-100;
		int i3=-(i1+i2);
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		
		boolean flag=true;
		System.out.println(!flag);
		System.out.println(!!flag); //!! = positive
		
		
		int i=10, j=5;
		i++;  //same as i =i +1
		--j;  //same as j=j-1
		
		System.out.println(i);
		System.out.println(j);
		
		

	}

}
