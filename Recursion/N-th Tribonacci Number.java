
// 36/39 testcase passes -> TLE (have to use DP)
class Solution {
      static int getTribonacci(int val){

        if(val == 0){
            return 0;
        }
        if(val == 1){
            return 1;
        }

        if(val == 2){
            return 1;
        }

        int n = val - 3;

        int res = getTribonacci(n) + getTribonacci(n + 1) + getTribonacci(n + 2);
        return res;

    }
    public int tribonacci(int n) {
        return getTribonacci(n);
    }
}
