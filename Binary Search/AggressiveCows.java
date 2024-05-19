package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

    static void distributeCows(int stalls, int[] arr, int cows){

        Arrays.sort(arr);
        int low = 1;
        int high = 0;

        for(int val : arr){
            high = Math.max(val, high);
        }

        int potentialAns = 0;
        while(low <= high){
            int mid = (low+high)/2;

            if(isSafeToPlaceCows(mid,arr,cows)){
                potentialAns = mid;
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.println(potentialAns);

    }

    private static boolean isSafeToPlaceCows(int mid, int[] arr, int cows) {

        int cowsCounter = 1;
        int cowPlaced = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(cowsCounter == cows){
                return true;
            }

            if(arr[i] - cowPlaced >= mid){
                cowPlaced = arr[i];
                cowsCounter++;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        distributeCows(5,new int[]{1,2,4,8,9}, 3);
    }
}
