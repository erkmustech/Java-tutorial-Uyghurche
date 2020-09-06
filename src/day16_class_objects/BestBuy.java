package day16_class_objects;

public class BestBuy {

	public static void main(String[] args) {
		
		Cellphone cell=new Cellphone();
		Cellphone cell2=new Cellphone();
		
		
		cell.brand="apple";
		cell.price=900;
		
		
		System.out.println("this cell's brand is: "+cell.brand);
		System.out.println(cell.price);
		
	    cell.call();
	    cell.message();
	    
	    cell2.brand="sumsung";
	    
	    System.out.println(cell2.brand);
	    cell.message();
		
	}

}
