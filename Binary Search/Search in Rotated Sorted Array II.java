class Solution {
        private static boolean getElement(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return true;
            }

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low+1;
                high=high-1;
                continue;
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

        return false;

    }

    public boolean search(int[] nums, int target) {
        return getElement(nums, target);
    }
}
