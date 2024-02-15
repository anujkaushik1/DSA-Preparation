package Recursion.Arrays;

public class FirstOccurence {
    static int firstOccur(int arr[], int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        return arr[idx] == x ? idx : firstOccur(arr, idx + 1, x);
    }
    public static void main(String[] args) {
        System.out.println(firstOccur(new int[]{18,6,9,1,6,10, 6}, 0, 6));
    }
}
