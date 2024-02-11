package Recursion;

public class Factorial {

    static int fact(int n){

        if(n == 1){
            return  1;
        }

        int assumption = fact(n - 1);
        int nFactorial = n * assumption;

        return nFactorial;

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
