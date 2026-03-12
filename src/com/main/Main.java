package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;
import com.bogie.CargoBogie;

/*
 *
 * 		 
 * @author: Abhilaksh
 * @version: UC15
 * 
 * 
 */

public class Main {

	public static void main(String[] args){
		System.out.println("==================================");
		System.out.println("===Train Consist Management App===");
		System.out.println("==================================");
		System.out.println();

		CargoBogie c1 = new CargoBogie("Cylindrical");	
		c1.assignCargo("Petroleum");
		System.out.println();

		CargoBogie c2 = new CargoBogie("Rectanguler");	
		c2.assignCargo("Petroleum");

	}
	
	public static class CargoSafetyException extends RuntimeException{
		public CargoSafetyException(String message){
			super(message);
		}
	}

}