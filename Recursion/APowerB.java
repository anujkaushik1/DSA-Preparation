package Recursion;

public class APowerB {
    static int power(int a, int b){

        if(b == 1){
            return a;
        }

        return a * power(a, b - 1);

    }
    public static void main(String[] args) {

        System.out.println(power(2, 5));
    }
}
