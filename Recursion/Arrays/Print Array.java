package Recursion.Arrays;

public class PrintArray {
    static void print(int arr[], int idx){

        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);
        print(arr, idx + 1);

    }
    public static void main(String[] args) {

            print(new int[]{11,21,5,8,1}, 0);
    }
}
