package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.stream.Collectors;

//import com.bogie.Bogie;

/*
 *
 * 		 
 * @author: Abhilaksh
 * @version: UC11
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("===Train Consist Management App===");
		System.out.println("==================================");
		System.out.println();
		
		// Defining the Regex Pattern: 
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compiling the given patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainInput = sc.nextLine();
        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoInput = sc.nextLine();
        System.out.println();
        
        sc.close();
        
        Matcher trainMatcher = trainIdPattern.matcher(trainInput);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoInput);
        
        System.out.println("Validation Result: ");
        System.out.println("Valid Train ID: " + trainMatcher.matches());
        System.out.println("Valid Cargo ID: " + cargoMatcher.matches());


	}

}