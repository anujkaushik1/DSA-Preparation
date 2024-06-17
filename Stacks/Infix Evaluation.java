package Stacks;

import java.util.Stack;

public class InfixEvaluation {

    private static int getResult(char ch, int op1, int op2){
        int ans = 0;
        if(ch == '+'){
            ans = op2 + op1;
        }

        else if(ch == '-'){
            ans = op2 - op1;
        }

        else if(ch == '*'){
            ans = op2 * op1;
        }

        else if(ch == '/'){
            ans = op2 / op1;
        }

        else if(ch == '^'){
            ans =  (int)Math.pow(op2, op1);
        }
        return ans;
    }

    private static int getPrecedence(char ch){
        if(ch == '('){
            return -1;
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
        String str = "2*(5+3)/4";
        Stack<Integer> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                st1.push(ch - '0');
            }

            else{
                if(ch == '('){
                    st2.push(ch);
                }

                else if(ch == ')'){
                    while (!st2.isEmpty() && st2.peek() != '('){
                        int op1 = st1.pop();
                        int op2 = st1.pop();
                        char operator = st2.pop();
                        st1.push(getResult(operator, op1, op2));

                    }
                    st2.pop();
                }

                else if(st2.isEmpty()){
                    st2.push(ch);
                }

                else if(getPrecedence(ch) > getPrecedence(st2.peek())){
                    st2.push(ch);
                }

                else{
                    while (!st2.isEmpty() && getPrecedence(st2.peek()) >= getPrecedence(ch)){
                        int op1 = st1.pop();
                        int op2 = st1.pop();
                        char operator = st2.pop();

                        st1.push(getResult(operator, op1, op2));
                    }
                    st2.push(ch);
                }

            }
        }

        while (!st2.isEmpty()){
            int op1 = st1.pop();
            int op2 = st1.pop();
            char ch = st2.pop();
            st1.push(getResult(ch, op1, op2));
        }

        System.out.println(st1.pop());
    }
}
