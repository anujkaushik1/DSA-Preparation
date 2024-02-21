package Recursion.Strings;

public class Subsequence {
    static void printSubSequence(String str, int idx, String ans){

        if(idx ==  str.length()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(idx);
        printSubSequence(str, idx + 1, ans + ch);
        printSubSequence(str, idx + 1, ans);

    }
    public static void main(String[] args) {
        printSubSequence("abc",0,"");
    }
}
