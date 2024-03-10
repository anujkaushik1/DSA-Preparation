// TLE FOR 2 TEST CASES

package Recursion.Arrays;

public class MinimumCoinsToProduceSum {

    private static int resultCoins = Integer.MAX_VALUE;
    private static void produceMinimumSum(int[] arr, int cost, int coins) {

        if(cost == 0){
            resultCoins = Math.min(resultCoins, coins);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(cost >= arr[i]){
                produceMinimumSum(arr, cost - arr[i], coins + 1);
            }
        }
    }

    public static void main(String[] args) {

        produceMinimumSum(new int[]{1 ,2 ,5 ,10 ,20 ,50}, 256324, 0);
        System.out.println(resultCoins);
    }

}
