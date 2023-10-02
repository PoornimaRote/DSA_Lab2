package com.greatLearning.Currency;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

	        System.out.println("Enter the size of currency denominations: ");
	        int size = scn.nextInt();
	        int[] denominations = new int[size];

	        System.out.println("Enter the currency denominations value: ");

	        for (int i = 0; i < size; i++) {
	            denominations[i] = scn.nextInt();
	        }

	        System.out.println("Enter the amount you want to pay: ");
	        int amount = scn.nextInt();

	        MergeSort s = new MergeSort();
	        s.sort(denominations, 0, denominations.length - 1);

	        Currency curr = new Currency();
	        curr.currencyCount(denominations, amount);

	        scn.close();
		
	}

}
