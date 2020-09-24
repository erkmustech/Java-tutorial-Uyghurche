package day44_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {

	public static void main(String[] args) {
			
        int[] num=new int[3];  // 3 number 
        
		Shape[] shapes=new Shape[4];  //  3 object 
		shapes[0]= new Triangle();
		shapes[1]= new Square();
		shapes[2]= new Circle();
		
	  for(Shape sh:shapes) {
		  System.out.println(sh.getClass().getSimpleName());
		  sh.draw();
	  }
		
//	  ArrayList<Shape> shapList = new ArrayList<>();
	  List<Shape> shapList = new ArrayList<>();
	  
	  shapList.add(new Triangle());
	  shapList.add(new Circle());
	  shapList.add(new Square());
	  
	}

}
