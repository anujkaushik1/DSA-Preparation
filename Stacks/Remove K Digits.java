class Solution {
    public String removeKdigits(String str, int k) {
         Stack<Integer> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - '0';

            if(st.isEmpty()){
                st.push(num);
            }

            else{
                if(num > st.peek()){
                    st.push(num);
                }
                else{
                    while (!st.isEmpty() && num < st.peek() && k != 0){
                        st.pop();
                        k--;
                    }
                    st.push(num);
                }
            }
        }
        String ans = "";

        for(int i = 0; i < k; i++){  // stack [1,2,3,4] k = 2 (toh isme top 2 elements remove krdenege)
            st.pop();
        }

        while (!st.isEmpty()){
            ans = st.pop() + ans;
        }

        if(ans.length() == 0){
            return "0";
        }

        int i = 0;  //saari leading zeros hatane ke liye
        while (i < ans.length()){
            if(ans.charAt(i) != '0'){
                break;
            }
            i++;
        }
        ans = ans.substring(i);
        if(ans.length() == 0){
            return "0";
        }
        return ans;
    }
}
