package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {15,1,6,3,-1,2,10};

        int x = -1;

        while(x < arr.length - 1){
            int y = getMinElement(x + 1, arr);
            swap(x + 1, y, arr);
            x++;
        }

        for(int val : arr){
            System.out.print(val+ "---");
        }

    }

    private static int getMinElement(int idx, int[] arr) {
        int minIdx = idx;

        for(int i = idx + 1; i < arr.length; i++){
            if(arr[i] < arr[minIdx]){
                minIdx = i;
            }
        }
        return minIdx;
    }

    private static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
