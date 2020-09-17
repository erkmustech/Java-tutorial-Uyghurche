package day38_inheritance2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj=new StaticSub();
		obj.num=5;
		obj.print();
		
		StaticSub.num=10;
		obj.print();
		System.out.println(StaticSub.num);
	}

}
