package com.main;



/*
 *
 * @author: Abhilaksh
 * @version: UC18
 * 
 * 
 */

public class Main {

	public static void main(String[] args){
		System.out.println("==================================");
		System.out.println("===Train Consist Management App===");
		System.out.println("==================================");
		System.out.println();

		String[] bogies = {"BG101","BG102","BG103","BG104","BG105"};
		
		System.out.println("Available Bogie IDs:");
		for(String s : bogies) System.out.println(s);
		
		String searchID = "BG103";
		boolean found = false;
		
		for(String s : bogies) if(s.equals(searchID)) { found = true; break;}
		System.out.println();
		
		if(found) System.out.println("Bogie " + searchID + " found in train consist");
		else System.out.println("Bogie " + searchID + " not found in train consist");
	}
}