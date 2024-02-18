package Recursion.Strings;

public class RemoveOccurence {

    static void printWithoutOccurence(String str, int idx, String ans, char x){

        if(idx == str.length()){
            System.out.println(ans);
            return;
        }

        if(str.charAt(idx) != x){
            printWithoutOccurence(str, idx + 1, ans + str.charAt(idx), x);
        }
        else{
            printWithoutOccurence(str, idx + 1, ans, x);

        }

    }

    public static void main(String[] args) {
        String ans = "";
        String str = "xxxbdhshxxxxxxxxxxxxxxa";
        char x = 'x';

        printWithoutOccurence(str, 0, ans, x);

    }
}
