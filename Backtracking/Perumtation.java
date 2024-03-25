package Backtracking;


    static String swap(String str, int i, int j){
        char arr[] = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);

    }

    static void generatePermutationBacktrack(String str, int l){

        if(l == str.length()){
            System.out.println(str);
            return;
        }

        for(int i = l; i < str.length(); i++){
            str = swap(str, l, i);
            generatePermutationBacktrack(str, l + 1);
            str = swap(str, l, i);
        }

    }

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
