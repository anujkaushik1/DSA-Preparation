package Recursion.Strings;

public class SubsequenceRangeNumber {

    static void generateRangeSub(int i, String output, int n){

        if(i > n){
            System.out.println(output);
            return;
        }

        generateRangeSub(i + 1, output + i, n);
        generateRangeSub(i + 1, output, n);
    }

    public static void main(String[] args) {
        generateRangeSub(1, "", 3);
    }
}
