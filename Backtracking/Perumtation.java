package Backtracking;

// RECURSION =>
public class Permutation {
    static void generatePermutation(String str, String out){

        if(str.length() == 0){
            System.out.println(out);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            String reststr = str.substring(0,i) + str.substring(i+1);
            String ans = out + str.charAt(i);

            generatePermutation(reststr, ans);
        }

    }
    public static void main(String[] args) {
            generatePermutation("abc", "");
    }
}
