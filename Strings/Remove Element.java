class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}


class Solution {
    public int removeElement(int[] nums, int val) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1 && nums[0] == val){
            return 0;
        }

        if(nums.length == 1 && nums[0] != val){
            return 1;
        }

        int i = 0, j = nums.length - 1;

        while(i < j){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }

            else{
                i++;
            }
        }
        int count = 0;
        for(int val1 : nums){
            if(val1 == val)
                return count;

            count++;
        }

        return count;
    }
}
