package Stacks;

import java.util.Stack;

public class InfixToPrefix {
    private static String reverseExpression(String str){
        String ans = "";
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '('){
                ans += ')';
            }
            else if(str.charAt(i) == ')'){
                ans += '(';
            }
            else{
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    private static int getPrecedence(char ch){
        if(ch == '('){
            return 0;
        }
        if(ch == '+' || ch == '-'){
            return 1;
        }

        if(ch == '*' || ch == '/'){
            return 2;
        }

        if(ch == '^'){
            return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "((A+B)*(C-D/E)+F)^(G+H*I)";
        str = reverseExpression(str);
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                ans += ch;
            }

            else if(ch == '('){
                st.push(ch);
            }

            else if(ch == ')'){
                while (!st.isEmpty() && st.peek() != '('){
                    ans += st.pop();
                }
                st.pop();
            }
            else if(st.isEmpty()){
                st.push(ch);
            }
            else if(getPrecedence(ch) > getPrecedence(st.peek())){
                st.push(ch);
            }
            else{
                while (!st.isEmpty() && getPrecedence(st.peek()) >= getPrecedence(ch)){
                    ans += st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()){
            ans += st.pop();
        }
        ans = reverseExpression(ans);
        System.out.println(ans);
    }
}
