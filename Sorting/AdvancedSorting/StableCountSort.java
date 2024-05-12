package BasicSorting;

public class StableCountSort {

    static int[] getMaxMin(int arr[]){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int val : arr){
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
        }

        return new int[]{max,min};
    }

    static void stableCountSort(int arr[]){

        int maxMin[] = getMaxMin(arr);
        int max = maxMin[0];

        int[] frequency = new int[max + 1];

        for(int i = 0; i < arr.length; i++){
            frequency[arr[i]]++;
        }

        for(int i = 1; i < frequency.length; i++){
            frequency[i] += frequency[i - 1];
        }

        int[] output = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            int element = arr[i];
            int frequencyElement = frequency[element];

            // because we are now considering 0 based indexing
            output[frequencyElement - 1] = element;
            frequency[element]--;
        }

        

    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,2,7,5,2};

        stableCountSort(arr);



    }
}
