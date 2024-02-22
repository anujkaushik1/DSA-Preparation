package Recursion.Patterns;

public class LetterCombination {
    static void printCombination(String mapper[], String str, String ans, int idx){

        if(idx == str.length()){
            System.out.println(ans);
            return;
        }

        int arrayIdx = str.charAt(idx) - '0';
        String letter = mapper[arrayIdx];
        for(int i = 0; i < letter.length(); i++){
            printCombination(mapper, str,  ans + letter.charAt(i), idx + 1);
        }

    }
    public static void main(String[] args) {
        String mapper[] = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        printCombination(mapper, "23", "", 0);

    }
}
