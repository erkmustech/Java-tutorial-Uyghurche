package day34_Constructors_Encupsulation;

public class Floor {
	
	double width;
	double length;
	
	public Floor(double width, double length) {
		this.width = Math.round(width);
		this.length = Math.round(length);
		
//		if(this.width<0) {
//			width=0;
//		}
	}
	
	public double getArea() {
		return width*length;
		
		
		
	}
	
	
	
	
	

}
