package com.main;

import java.util.*;

/*
 * @author: Abhilaksh
 * @version: UC3
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("====Train Consist Management App====");
		System.out.println("====================================");
		
		Set<String> trainConsist = new HashSet<>();
		
		// Adding the Bogie Ids:

		trainConsist.add("BG101");
		trainConsist.add("BG102");
		trainConsist.add("BG103");
		trainConsist.add("BG104");
		
		// Adding the Duplicates here:
		
		trainConsist.add("BG101");
		trainConsist.add("BG102");
		
		// No matter how many times you add, Set will always contain the unique elements here.
		System.out.println("Passenger Bogies: " + trainConsist);
	}

}
