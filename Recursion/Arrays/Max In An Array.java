package Recursion.Arrays;

public class MaxInAnArray {
    static int getMax(int arr[], int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        return Math.max(arr[idx], getMax(arr, idx + 1));

    }
    public static void main(String[] args) {
        System.out.println(getMax(new int[]{18,2,9,1,6,2}, 0));
    }
}
