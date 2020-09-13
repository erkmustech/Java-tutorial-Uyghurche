package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class Mashik {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=getList(19);
		System.out.println(list.toString());
		getRandomList(5);
		System.out.println(getRandomList(5));
		
		
//		getIntL(10);
		
		
	}

	private static ArrayList<Integer> getList(int n) {
		ArrayList<Integer> nl=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			nl.add(i);
			
		}
		return nl;
	}
	public static ArrayList<Integer> getRandomList(int size){
		Random r=new Random();
		ArrayList<Integer>rn=new ArrayList<>();
		for(int i=0;i<=size;i++) {
			rn.add(r.nextInt(10));
			
		}
		return rn;
		
	}
	public static void getIntL(ArrayList<String> str){
		ArrayList<Integer> il=new ArrayList<>();
		for(String s:str) {
			il.add(Integer.parseInt(s));
			
		}
		System.out.println(il.toString());
		
	}
	
	

}
