package Recursion.Strings;

public class RemoveOccurence {

    static String printWithoutOccurence(String str, int idx, String ans, char x){

        if(idx == str.length()){
            return ans;
        }

        if(str.charAt(idx) != x){
            ans += str.charAt(idx);
        }

        return printWithoutOccurence(str, idx + 1, ans, x);

    }

    public static void main(String[] args) {
        String ans = "";
        String str = "xxxxxxxxxxxxxxxxxxa";
        char x = 'x';

        System.out.print(printWithoutOccurence(str, 0, ans, x));

    }
}
