package GreedyAlgorithm;

import java.util.Arrays;

public class indianCoinChange {
    /*
    1 7 10 in this case greedy algo fails if we takes only these three coins then algo fails so we use dp
    if we want to make 15 then minimum no of coins sholud we 3 ie . 7+7+1;
    but according to greedy the minimum no of coins are 10+1+1+1+1+1+1 = 15 ie. 6 coins
    so this algorithm fails in this case so we use dp,
    but in case of indian currency greedy aprroach is good
    */
    public static void main(String[] args) {


        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int amount = 20;
        int ways = 0;

        while (amount > 0) {
            int indx = Arrays.binarySearch(coins, amount);
            if (indx < 0) {
                indx = Math.abs(indx) - 2;
            }
            amount = amount - coins[indx];
            ways++;
            System.out.print(coins[indx] + "  ");
        }
        System.out.println();
        System.out.println("Number of ways to make " + amount + "using indian currency are : " + ways);
    }
}
