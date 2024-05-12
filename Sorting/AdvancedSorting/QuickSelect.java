package BasicSorting;

public class QuickSelect {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[], int l, int r, int pivotIdx){
        int m = l;
        int x = arr[pivotIdx];

        swap(arr, l, r + 1);

        for(int i = l; i <= r; i++){

            if(arr[i] < x){
                swap(arr, i, m);
                m++;
            }

        }

        swap(arr, m, r + 1);
        return m;


    }

    static void quickSort(int arr[], int l, int r, int k){

        int partionIdx = partition(arr, l, r - 1, l);

        if(partionIdx == k){
            System.out.println(arr[k]);
        }
        else if(k < partionIdx){
            quickSort(arr, l, partionIdx - 1, k);
        }
        else{
            quickSort(arr, partionIdx + 1, r, k);
        }


    }

    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,9,1,3};
        quickSort(arr, 0, arr.length - 1, 6);
    }
}
