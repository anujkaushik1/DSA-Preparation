

package Practice;

public class Q4 {
    static int nth(int n){
        if(n == 0 || n < 0) return 0;
        if(n ==1) return 1;
        if(n == 2) return 1;

        return nth(n- 1) + nth(n - 2) + nth(n - 3);
    }
    public static void main(String[] args) {
        System.out.println(nth(25));
    }
}
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
