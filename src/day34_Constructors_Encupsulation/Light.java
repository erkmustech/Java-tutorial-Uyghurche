package day34_Constructors_Encupsulation;

public class Light {
	
	private static int watt = 0;
	int waat;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false);
		System.out.println("Retrun from no argument constructor No1");
		
		
	}
	



	public Light(int i, boolean b) {
		this("watt","indicator","x");
	    System.out.println("Return from 2 parameters constructor No2");	
	}
	
	
	public Light(String string, String string2, String location) {

		this.watt = watt;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from cosotror no.3");
	}

}
