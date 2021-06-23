package com.bridgelabz.vowel_or_consonant;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Alphabet :: ");
		char alphabet = sc.next().charAt(0);
		sc.close();	
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') 
		{
			System.out.println("Its an Vowel");
		}
		else 
		{			
			System.out.println("Its a Consonant");
		}
		
		
	}

}
