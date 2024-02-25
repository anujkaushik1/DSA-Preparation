package Recursion.Strings;

public class MazePath {
    static int getCountOfTotalWays(int i, int j, int m, int n){

        if(i >= m || j >= n){
            return 0;
        }

        if(i == m - 1 && j == m - 1){
            return 1;
        }

        int totalWays = getCountOfTotalWays(i, j + 1, m, n) + getCountOfTotalWays(i + 1, j, m, n);

        return totalWays;


    }
    public static void main(String[] args) {
        System.out.println(getCountOfTotalWays(0,0,3,3));
    }
}
