package com.main;

import java.util.*;

/*
 * @author: Abhilaksh
 * @version: UC5
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("====Train Consist Management App====");
		System.out.println("====================================");
		System.out.println("");
		
		Set<String> trainConsist = new LinkedHashSet<>();
		
		
		// Preserving the insertion order of the additions.
		trainConsist.add("Engine");
		trainConsist.add("Sleeper Car");
		trainConsist.add("AC Tier");
		trainConsist.add("Cargo Bogie");
		trainConsist.add("Engine");
		
		System.out.println("Train Consist:\n" + trainConsist + "\n");
		

	}

}
