package day40_MethodHiding;

public class Bedroom {
	
	Wall1 wall1;
	Wall2 wall2;
	Wall3 wall3;
	Wall4 wall4;
	Lamp lamp;
	Bed bed;
	
	
	public Bedroom(Wall1 wall1, Wall2 wall2, Wall3 wall3, Wall4 wall4, Lamp lamp, Bed bed) {
		
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.lamp = lamp;
		this.bed = bed;
	}


	public void makeABad() {
		System.out.println("bedrom was inlcude these");
	}
	

}
