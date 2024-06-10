class Solution {
    public String simplifyPath(String s) {
        Stack<String> st = new Stack<>();
        String[] components = s.split("/");

        for(String str : components){
            if(str.equals(".") || str.equals("")){
                continue;
            }
            if(st.isEmpty() && str.equals("..")){
                continue;
            }
            else if(st.isEmpty()){
                st.push(str);
            }
            else{
                if(str.equals("..")){
                    st.pop();
                }
                else{
                    st.push(str);
                }
            }
        }

        String ans = "";
        while(!st.isEmpty()){
           ans = "/" + st.pop() + ans;
        }

        return ans.length() == 0 ? "/" : ans;

    }
}
