package BasicSorting;
o(n * K)

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {4,1,16,3,2,9};
        int k = 2;

        int tempK = 6;
        int potAns = -1;

        while(tempK != 0){

            int maxIdx = getMaxElement(arr);
            potAns = arr[maxIdx];
            arr[maxIdx] = Integer.MIN_VALUE;

            tempK--;
        }

        System.out.println(potAns);

    }

    private static int getMaxElement(int[] arr) {
        int maxIdx = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[maxIdx]){
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
