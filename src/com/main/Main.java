package com.main;

import java.util.*;
import java.util.stream.Collectors;
import com.bogie.Bogie;


/*
 * 
 * 
 * @author: Abhilaksh
 * @version: UC9
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("===Train Consist Management App===");
		System.out.println("==================================");
		System.out.println();
		
		List<Bogie> bogies = new ArrayList<>();
		
		// Adding The New Bogies class and capacity
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Sleeper",92));
		bogies.add(new Bogie("AC Chair",66));
		bogies.add(new Bogie("General",90));
		
		System.out.println("All Bogies:");
		
		// Printing all capacities
		for(Bogie b : bogies) {
			System.out.println(b.name + " -> " + b.capacity);
		}
		
		Map<String,List<Bogie>> groupedMap = bogies.stream().collect(Collectors.groupingBy(bogie -> bogie.name));
		
		System.out.println();
		System.out.println("Grouped Bogies:\n");
		
		// first getting all the same classes from grouped keys.
		
		for(String key : groupedMap.keySet()) {
			System.out.println("Bogie Type: " + key);
			for(Bogie b : groupedMap.get(key)) {
				System.out.println("Capacity -> " + b.capacity);
			}
			System.out.println();
		}
		

	}

}