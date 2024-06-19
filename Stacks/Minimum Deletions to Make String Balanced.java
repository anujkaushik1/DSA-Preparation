class Solution {
    public int minimumDeletions(String str) {
        Stack<Character> st = new Stack<>();
        int deletions = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!st.isEmpty() && st.peek() > ch){
                st.pop();
                deletions++;
            }
            else{
                st.push(ch);
            }
        }
        return deletions;
    }
}
