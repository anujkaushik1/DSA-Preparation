class Solution {
    public int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high){
            int mid = (low+high)/2;

            // left region is sorted
            if(arr[mid] >= arr[low]){
                min = Math.min(arr[low], min);
                low = mid + 1;
            }
            // right region is sorted
            else{
                min = Math.min(arr[mid], min);
                high = mid - 1;
            }
        }
        return min;

    }
}
