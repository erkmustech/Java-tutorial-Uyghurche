package day40_MethodHiding;

public class Bed {
	
	private String style;
	private int pillow;
	private int height;
	
	public Bed(String style, int pillow, int height) {
	
		this.style = style;
		this.pillow = pillow;
		this.height = height;
	}
	public String getStyle() {
		return style;
	}
	public int getPillow() {
		return pillow;
	}
	public int getHeight() {
		return height;
	}
	

}
