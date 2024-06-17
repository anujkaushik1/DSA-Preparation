class Solution {
    static String postToPre(String str) {
          Stack<String> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                st.push(ch + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String concated = ch + op2 + op1;
                st.push(concated);
            }

        }
        return st.pop();
    }
}
