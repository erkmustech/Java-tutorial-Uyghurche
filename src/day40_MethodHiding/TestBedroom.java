package day40_MethodHiding;

public class TestBedroom {

	public static void main(String[] args) {
		
		Wall1 w1=new Wall1(null);
		Wall2 w2=new Wall2(null);
		Wall3 w3=new Wall3(null);
		Wall4 w4=new Wall4(null);
		
		Bed bed=new Bed("moden",4,3);
		
		Lamp lamp=new Lamp("classic",false, 75);
		
		Bedroom br=new Bedroom(w1, w2, w3, w4, lamp, bed);
		br.makeABad();
		
		
		
		
		
	}

}
