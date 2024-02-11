package Recursion;

public class PrintOddEvenSequence {

    static void printEven(int n){
        if(n == 0){
            return;
        }
        printEven(n -1);

        if(n % 2 == 0){
            System.out.print(n + " ");
        }

    }
    static void printOdd(int n){
        if(n == 0){
            return;
        }

        if(n % 2 != 0){
            System.out.print(n + " ");
        }
        printOdd(n - 1);
    }
    static void print(int n){
        printOdd(n);
        printEven(n - 1);
    }

    public static void main(String[] args) {
        print(16);
    }
}
