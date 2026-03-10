package com.main;

import java.util.*;

/*
 * @author: Abhilaksh
 * @version: UC6
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("====Train Consist Management App====");
		System.out.println("====================================");
		System.out.println("");
		
		Map<String,Integer> capacityMap = new HashMap<>();
		
		capacityMap.put("First Class", 24);
		capacityMap.put("Cargo", 120);
		capacityMap.put("Sleeper Car", 72);
		capacityMap.put("AC Tier", 56);
		
		System.out.println("The Bogie Capacity Details:");
		
		for(String key : capacityMap.keySet()) {
			System.out.println(key + " -> " + capacityMap.get(key));
		}
	}

}
