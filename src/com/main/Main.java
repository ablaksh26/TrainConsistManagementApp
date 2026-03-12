package com.main;

import java.util.*;

import com.bogie.CargoBogie;

/*
 *
 * 		 
 * @author: Abhilaksh
 * @version: UC12
 * 
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("===Train Consist Management App===");
		System.out.println("==================================");
		System.out.println();
		
		List<CargoBogie> cargoBogie = new ArrayList<>();
		
		cargoBogie.add(new CargoBogie("Cylindrical","Petroleum"));
		cargoBogie.add(new CargoBogie("Open","Coal"));
		cargoBogie.add(new CargoBogie("Box","Grain"));
		cargoBogie.add(new CargoBogie("Cylindrical","Coal"));
		
		System.out.println("Goods Bogies in Train: ");
		for(CargoBogie b : cargoBogie) {
			System.out.println(b.type + " -> " + b.cargo);
		}
		System.out.println();
		
		boolean isSafe = cargoBogie.stream().allMatch(bogie -> validateBogie(bogie));
		
		System.out.println("Safety Compliance Status: " + isSafe);
		
		if(isSafe) System.out.println("Train formation is SAFE");
		else System.out.println("Train formation is NOT SAFE");

	}
	public static boolean validateBogie(CargoBogie b) {
        if ("cylindrical".equalsIgnoreCase(b.type)) {
            return "Petroleum".equalsIgnoreCase(b.cargo);
        }
        return true;
    }

}