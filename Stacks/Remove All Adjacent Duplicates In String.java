class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                char val = st.peek();
                if(val == ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }

        return ans;
    }
}
