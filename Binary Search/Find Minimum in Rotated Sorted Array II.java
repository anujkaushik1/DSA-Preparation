class Solution {
    public int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = high - (high - low)/2;

            if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                min = Math.min(arr[mid], min);
                low++;
                high--;
                continue;
            }

            if(arr[mid] >= arr[low]){
                min = Math.min(arr[low], min);
                low = mid + 1;
            }

            else{
                min = Math.min(arr[mid], min);
                high = mid - 1;
            }

        }   
        return min;
    }
}
