package Recursion.Patterns;

public class Pattern3 {
    static void printStars(int row, int col, int n, boolean flag){

        if(row > n){
            return;
        }

        if(col > row){
            System.out.println();
            return;
        }

        if(!flag){
            printStars(row + 1, col, n, false);
        }
        System.out.print("* ");
        printStars(row, col + 1, n, true);
    }
    public static void main(String[] args) {
        printStars(1,1,5, false);
    }
}
