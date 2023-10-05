package com.greatLearning.Currency;

public class Currency {
        public void currencyCount(int[] denominations, int amount) {
                  int[] countDenominations = new int[denominations.length];
                  for (int i = 0; i < denominations.length; i++) {
                        if (amount >= denominations[i]) {
                       	        int countCurr = amount / denominations[i];
                                amount = amount - (denominations[i] * countCurr);
                                countDenominations[i] = countCurr;
                                if (amount == 0) {
                                    break;
                                }
                         }
                   }
       
                  if(amount==0) {
        	        System.out.println("Your payment approach in order to give min no of notes will be:");
        	        for (int i = 0; i < denominations.length; i++) {
        		        if (countDenominations[i] != 0) {
        			            System.out.println(denominations[i] + ":" + countDenominations[i]);
        		        }
        	         }
                  }
                  else {
        	         System.out.println("Exact amount cannot be paid with the highest possible denominations");
                  }
        }
}
