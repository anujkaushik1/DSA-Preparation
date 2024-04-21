package BasicSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,4,9,4 };

        for(int i = 0; i < arr.length - 1; i++){
            boolean isSorted = true;  // bhar declare issleye nai kra (agar kisi bhi iteration ke baad sort hogya h purra array toh agge kyu krna -> zaruri nai h first iteration ke baad hi sorted ho, ho skta h fourth iteration ke baad sorted mil jaue)
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }

            }

            if(isSorted){
                break;
            }

        }

        for(int val : arr){
            System.out.print(val+ "---");
        }
    }
}
