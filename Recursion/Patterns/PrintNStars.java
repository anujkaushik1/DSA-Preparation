package Recursion.Patterns;

public class PrintNStars {

    static void lineByLine(int n, int fixed){

        if(n == 0){
            return;
        }

        printInSingle(fixed);
        System.out.println();
        lineByLine(n - 1, fixed);
    }
    static void printInSingle(int n){

        if(n == 0){
            return;
        }

        System.out.print("* ");
        printInSingle(n - 1);
    }

    public static void main(String[] args) {
        lineByLine(4,4);
    }
}
