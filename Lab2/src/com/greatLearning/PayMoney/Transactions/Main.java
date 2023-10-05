package com.greatLearning.PayMoney.Transactions;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Transaction t = new Transaction();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array : ");
		int size = scn.nextInt();
		int[]transactions = new int[size];
		System.out.println("Enter the values of transaction : ");
		for(int i=0 ; i< size ; i++) {
			transactions[i] = scn.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		int targetSize = scn.nextInt();
		for(int i = 0; i < targetSize ; i++) {
			System.out.println("Enter target value : ");
			int target = scn.nextInt();
			int res = t.targetCheck(transactions, target);
			if(res>=0) {
				System.out.println("Target achieved after " + (int) (res+1) +" transaction");
			}
			else {
				System.out.println("The target cannot be achieved with the given transaction.");
			}
		}
		
		scn.close();
	}
}
