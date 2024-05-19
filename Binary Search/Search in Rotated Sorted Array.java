package BinarySearch;

public class SearchElementSortedRotated {
    private static int getElement(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid;
            }

            // find sorted region (left part consider)
            if(arr[mid] >= arr[low]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            // right part consider - sorted region
            else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        System.out.println(getElement(new int[]{1}, 3));
    }
}
