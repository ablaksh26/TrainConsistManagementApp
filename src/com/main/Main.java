package com.main;

import java.util.*;

/*
 * @author: Abhilaksh
 * @version: UC2
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("====Train Consist Management App====");
		System.out.println("====================================");
		
		List<String> trainConsist = new ArrayList<>();
		
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First Class");
		
		System.out.println("After adding Bogies: ");
		System.out.println("Passenger Bogies: " + trainConsist);
		System.out.println();
		
		System.out.println("After removing AC Chair: ");
		trainConsist.remove("AC Chair");
		System.out.println("Passenger Bogies: " + trainConsist);
		System.out.println();
		
		System.out.println("Checking if Sleeper exist?");
		System.out.print("Contains Sleeper: ");
		System.out.println(trainConsist.contains("Sleeper"));
		System.out.println();
		
		System.out.println("Final Train Passenger Consist: " + trainConsist);

	}

}
