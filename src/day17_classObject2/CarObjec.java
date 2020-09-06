package day17_classObject2;

public class CarObjec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b1=new BMW();
		BMW b2=new BMW();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.model="m3";
		
		b1.showprice();
		

	}

}
