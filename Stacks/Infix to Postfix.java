class Solution {
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

    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String str) {
Stack<Character> st = new Stack<>();
        String output = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                output += ch;
            }
            else{

                if(ch == '('){
                    st.push('(');
                }
                else if(ch == ')'){
                    while (!st.isEmpty() && st.peek() != '('){
                        output += st.pop();
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
                        output += st.pop();
                    }
                    st.push(ch);
                }

            }

        }

        while (!st.isEmpty()){
            output += st.pop();
        }
        
        return output;

    }
}
