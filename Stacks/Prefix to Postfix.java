class Solution {
    private static String reverse(String str){
        String ans = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ans += str.charAt(i);
        }
        return ans;
    }
    static String preToPost(String str) {
        str = reverse(str);
        Stack<String> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                st.push(ch+"");
            }
            else{
                if(!st.isEmpty()){
                    String op1 = st.pop();
                    String op2 = st.pop();
                    String concated = op1 + op2 + ch;
                    st.push(concated);
                }
            }
        }

        return st.pop();
    }
}
