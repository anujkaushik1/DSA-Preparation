class Solution {
    public int scoreOfParentheses(String str) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                st.push(0);
            }
            else if(ch == ')' && st.peek() == 0){
                st.pop();
                st.push(1);
            }

            else{
                int ans = 0;
                while (!st.isEmpty() && st.peek() != 0){
                    ans += 2 * st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
                st.push(ans);
            }
        }
        int ans = 0;
        while (!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }
}
