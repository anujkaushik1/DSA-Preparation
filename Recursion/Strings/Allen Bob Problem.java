package Recursion.Strings;

public class AllenBobProblem {
    static void printDecodings(String str, int i, String output){

        if(i == str.length()){
            System.out.println(output);
            return;
        }

        String code1 = str.charAt(i) + "";

        printDecodings(str, i + 1, output + (char)(Integer.parseInt(code1) - 1 + 97));

        if(i < str.length() - 1) {
            String code2 = str.substring(i, i + 2);
            if(Integer.parseInt(code2) <= 26)
                printDecodings(str, i + 2, output + (char)(Integer.parseInt(code2) - 1 + 97));
        }

    }
    public static void main(String[] args) {
        printDecodings("123", 0, "");
    }

}
