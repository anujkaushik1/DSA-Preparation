 public static int evaluatePostFix(String str)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                st.push(ch - '0');
            }
            else{
                
                int op1 = st.pop();
                int op2 = st.pop();
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
                
                st.push(ans);
                
            }
        }
        
        return st.pop();
    }
