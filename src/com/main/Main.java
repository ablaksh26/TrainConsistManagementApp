package com.main;



/*
 *
 * 		 
 * @author: Abhilaksh
 * @version: UC16
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args){
		System.out.println("==================================");
		System.out.println("===Train Consist Management App===");
		System.out.println("==================================");
		System.out.println();

		int[] capacities = {72,78,69,81};
		System.out.println("Original capacities:");
		for(int c : capacities) System.out.print(c + " ");
		System.out.println("\n");
		
		for (int i = 0; i < capacities.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
		System.out.println("Sorted capacities: ");
		for(int c : capacities) System.out.print(c + " ");
	}
}