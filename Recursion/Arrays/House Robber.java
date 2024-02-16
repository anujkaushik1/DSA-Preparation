
// TLE => code is correct but have to use dp
package Recursion.Arrays;

public class HouseRobbers {
    static int getHouseRobbers(int arr[], int idx){

        if(idx >= arr.length){
            return 0;
        }

        int ifRobbed = arr[idx] + getHouseRobbers(arr, idx + 2);
        int ifNotRobbed = 0 + getHouseRobbers(arr, idx + 1);

        int ans = Math.max(ifRobbed, ifNotRobbed);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getHouseRobbers(new int[]{1,2,3,1}, 0));
    }
}
