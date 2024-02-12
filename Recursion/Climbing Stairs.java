// Code if correct but TLE (have to use dp)

package Recursion;

public class ClimbingStaris {
    static int climbStairs(int n) {
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
