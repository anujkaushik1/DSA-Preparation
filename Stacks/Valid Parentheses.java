class Solution {
       private  boolean isValidExpressionToEnterStack(char ch){
        if(ch == '(' || ch == '[' || ch == '{'){
            return true;
        }

        return false;
    }

    private  boolean isValidExpression(char expres, char ch){
        if(expres == '(' && ch == ')'){
            return true;
        }

        if(expres =='[' && ch == ']'){
            return true;
        }

        if(expres == '{' && ch == '}'){
            return true;
        }

        return false;
    }

    public  boolean checkValid(String str) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(isValidExpressionToEnterStack(ch)){
                st.push(ch);
            }
            else{
                if(st.isEmpty() || !isValidExpression(st.pop(), ch)){
                    return false;
                }
            }

        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
    public boolean isValid(String s) {
        return checkValid(s);
    }
}
