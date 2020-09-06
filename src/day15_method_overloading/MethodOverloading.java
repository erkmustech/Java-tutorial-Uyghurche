package day15_method_overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		/*
		 *Day-15 Summary

Method Overloading

If a class has multiple methods having same name but different parameters, it is known
as Method Overloading

public static int sum(int a,int b){
	return a+b;
}

public static int sum(int a,int b,int c){
	return a+b+c;
}

public static int sum(int a,int b,int c,int d){
	return a+b+c+d;
}


Rules:

1-Number of parameters
	add(int,int)
	add(int,int,int)

2-Data Type of parameters
	add(int,int)
	add(int,float)

3-Sequence of data type parameters
	add(int,float)
	add(float,int)

4-Invalid Case (return type)
	int add(int,int)
	float add(int,int)


5-Main Method

	public static void main(String[] args){}
	public static void main(String args){}
	public static void main(){}


6-Type Promotion

	6.1

	public static void sum(int a,long b){}
	public static void sum(int a,int b,int c){}

	sum(20,20); //second argument will be promoted to long

	6.2

	public static void sum(int a,int b){}
	public static void sum(long a,long b){}

	sum(20,20); 

	6.3

	public static void sum(int a,long b){}
	public static void sum(long a,int b){}

	sum(20,20); //error



		 */
		
		int x,y,z,d;
		x=2;
		y=3;
		z=4;
		d=5;
		
		add();
		add(x,y);
		add(x,"2");
		add(x,y,z);
		add(x,y,z,d);
		

	}
	private static void add(int x, String y) {
		System.out.println(x+" is "+y);
		
	}
	private static int add(int x,int y) {
		return x+y;
		
	}

	private static int add(int x, int y, int z) {
		return x+y+z;
		
	}

	private static int add(int x, int y, int z, int d) {
		return x+z+y+d;
	}

	private static int add() {
		
		return 0;
	}
	

}
