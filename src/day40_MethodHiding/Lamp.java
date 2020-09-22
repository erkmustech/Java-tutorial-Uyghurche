package day40_MethodHiding;

public class Lamp {
	private String style;
	private boolean battery;
	private int rating;
	
	public void turnon(boolean b) {
		System.out.println("lamp is turn on"+b);
		
	}
	public Lamp(String style, boolean battery, int rating) {
		super();
		this.style = style;
		this.battery = battery;
		this.rating = rating;
	}
	public String getStyle() {
		return style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getRating() {
		return rating;
	}
	

}
