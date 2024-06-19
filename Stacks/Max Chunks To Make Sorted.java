class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length == 0 || arr.length == 1){
            return arr.length;
        }   

        int[] maxArray = new int[arr.length];
        maxArray[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            maxArray[i] = Math.max(arr[i], maxArray[i - 1]);
        }
        int chunks = 0;

        for(int i = 0; i < maxArray.length; i++){
            if(maxArray[i] == i){
                chunks++;
            }
        }
        return chunks;
    }
}
