package com.bridgelabz.swappingtwonumbers;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutExtraVariabke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter Second number");
		int secondNumber = sc.nextInt();
		
		sc.close();
		
		System.out.println("Before Swaping");
		System.out.println("The First number = "+firstNumber);
		System.out.println("The second number = "+secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("After Swaping");
		System.out.println("The First number = "+firstNumber);
		System.out.println("The second number = "+secondNumber);
	}

}
