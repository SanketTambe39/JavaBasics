package com.bridgelabz.additionthreeinteger;

import java.util.Scanner;

public class AdditionOfThreeInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		System.out.print("Enter number of integers: ");
		int numberOfElements = scanner.nextInt();
		int[] a = new int[numberOfElements];	
		
		for(int i = 0; i < numberOfElements; i++){
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Triples are:");
		
		for(int i = 0; i < numberOfElements; i++){
			for(int j = i; j < numberOfElements; j++){
				for(int k = j; k < numberOfElements; k++){
					if((i != j) && (i != k) && (j != k)){
						if((a[i] + a[j] + a[k]) == 0){
							count++;
							System.out.println(a[i] + " " + a[j] + " " + a[k]);
						}
					}
				}
			}
		}
		System.out.println("Total number of triples are: " + count);
	}
}
