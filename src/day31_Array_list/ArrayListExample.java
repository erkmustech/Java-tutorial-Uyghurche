package day31_Array_list;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("mike");
		list.add(0 ,"max");
		list.add("erk");
		list.add(0,"furkan");
		
		System.out.println(list.get(0));
		list.set(0, "erk");
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		System.out.println(list.toString());
		list.add(0, "sayfu");
		list.set(1, "lutun");
		System.out.println(list.toString());
		
		
		
	}

}
