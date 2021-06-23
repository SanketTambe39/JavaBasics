package com.bridgelabz.flipcoin;

import java.util.Scanner;


/**
 * class to flip a coin and give percentage of heads and tails
 * @author Sanket
 *
 */

public class FlipCoinSimulatorMain {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many times you want to flip the coin :: ");
		int totalFlips = sc.nextInt();

		// Condition to Strictly get only positive number
		while(totalFlips <= 0) 
		{
			System.out.println("Oops !! You just entered Non_Positive number");
			System.out.println("Please Enter the Positive number again ::");
			totalFlips = sc.nextInt();
		}
		
		sc.close();
		
		int noOfHeads = flipCoin(totalFlips);

		double totalPercentOfHead = (noOfHeads*100)/totalFlips;
		double totalPercentOfTail = 100-totalPercentOfHead;
		
		System.out.println("Total Percentage Of Heads :: "+ totalPercentOfHead);
		System.out.println("Total Percentage Of Tails :: "+ totalPercentOfTail);
		
	}
	
	
	/**
	 * Name: flipCoin
	 * 
	 * Description: method to a flip a coin
	 * 
	 * Algorithm: passing noOfHeads as required attributes and checking if the numOfFlips is
	 * less than or equal to zero if yes throwing an error
	 * else calculating count of heads 
	 * 
	 * @param numOfFlips
	 * @return countHeads
	 * 
	 * Modification-History: Adding commits with industrial type on JUN-23-2021
	 * 
	 */
	public static int flipCoin(int numOfFlips) 
	{
		int countHeads = 0;
		for (int i = 0; i < numOfFlips; i++) 
		{
			// Math.random function for generating numbers between 0 and 1
			if (Math.random() > 0.5) 
			{
				countHeads++;
			}
		}
		return countHeads;
	}

}
