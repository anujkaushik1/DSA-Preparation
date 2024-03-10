
// GETTING TLE -> BELOW CODE IS CORRECT FOR TESTCASES (HAVE TO USE DP)
package Recursion.Arrays;

import javax.lang.model.element.Name;

public class MinimumTotalPossibleCostOfStones {

    private static int totalCost = Integer.MAX_VALUE;
    private static void getMinimumTotalCost(int[] stones, int i, int cost) {

        if(i == stones.length - 1){
            totalCost = Math.min(totalCost, cost);
            return;
        }

        if(i > stones.length){
            return;
        }

        getMinimumTotalCost(stones, i + 1, cost + Math.abs(stones[i] - stones[i + 1]));

        if(i + 2 < stones.length)
            getMinimumTotalCost(stones, i + 2, cost + Math.abs(stones[i] - stones[i + 2]));

    }
    public static void main(String[] args) {
        getMinimumTotalCost(new int[]{20, 5, 11, 19, 5, 1, 7, 5, 9, 6, 18, 4, 11, 20, 11, 15, 2, 14, 11, 11, 17, 20, 17, 1 ,1 ,15, 9, 6, 8, 19, 13, 16, 16, 15}, 0, 0);
        System.out.println(totalCost);
    }
}
