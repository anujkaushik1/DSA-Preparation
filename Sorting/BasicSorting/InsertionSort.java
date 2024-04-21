package BasicSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,4,9,4 };

        for(int i = 1; i < arr.length; i++){
            int currElement = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = currElement;

        }


        for(int val : arr){
            System.out.print(val+ "---");
        }
    }
}
