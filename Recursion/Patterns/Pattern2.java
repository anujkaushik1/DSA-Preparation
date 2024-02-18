package Recursion.Patterns;

public class Pattern2 {

    static void printStars(int row, int col, int n){

        if(row > n){
            return;
        }

        if(col > row){
            System.out.println();
            printStars(row + 1, 1, n);
            return;
        }

        System.out.print("* ");
        printStars(row, col + 1, n);

    }

    public static void main(String[] args) {
            printStars(1, 1, 5);
    }
}
