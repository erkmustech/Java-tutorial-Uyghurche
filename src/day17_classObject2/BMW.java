package day17_classObject2;

public class BMW {
	
	String make="BMW";
	String model;
	double price;
	
	
	public void showprice() {
		
		switch(model) {
		case "330i":
			price=30000;
			break;
		case "GC":
			price=20000;
			break;
		case "m3":
			price=18000;
			break;
			default:
				System.out.println(model+" is not avaible");
				price=0.0;
				
		}
		System.out.println("price is :" +price);
			
		}

}
