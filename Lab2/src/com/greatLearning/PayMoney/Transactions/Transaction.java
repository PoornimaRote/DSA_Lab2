package com.greatLearning.PayMoney.Transactions;

public class Transaction {
	public int targetCheck(int[]transactions, int target) {
		int sum=0;
		int n = transactions.length;
		for(int i=0 ; i< n ; i++) {
			sum+=transactions[i];
			if(sum>=target) {
				return i;
			}
		}
		return-1;
	}
}
