package day46_collectionFramwork;

import java.util.HashMap;
import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {
			
		Map<String, String>dataMap= new HashMap<>();
		
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("usernqm", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("url", "qa2.vytrack.com");
		
		System.out.println("KEY");
		for(String key:dataMap.keySet()) {
			System.out.print(key+" |");
		}
		
		System.out.println();
		for(String value: dataMap.values()) {
			System.out.print(value+" | ");
		}
		
		
	}

}
