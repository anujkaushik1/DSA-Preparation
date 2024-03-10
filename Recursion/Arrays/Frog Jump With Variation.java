package Recursion.Arrays;

public class FrogJumpVariation {

    private static int totalCost = Integer.MAX_VALUE;
    private static void getMinimumTotalCost(int[] stones, int i, int cost, int k) {

//        if(i > stones.length){
//            return;
//        }
        if(i == stones.length - 1){
            totalCost = Math.min(totalCost, cost);
            return;
        }

        for(int idx = 1; idx <= k && i + idx < stones.length; idx++){
             getMinimumTotalCost(stones, i + idx, cost + Math.abs(stones[i] - stones[i + idx]), k);

        }

    }


    public static void main(String[] args) {
        getMinimumTotalCost(new int[]{10,30,40,50,20}, 0, 0, 100);
        System.out.println(totalCost);
    }
}
