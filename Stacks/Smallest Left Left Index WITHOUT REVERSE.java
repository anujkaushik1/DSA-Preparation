  static List<Integer> leftSmaller(int n, int arr[])
    {
      Stack<Integer> st = new Stack<>();
        st.push(0);
        int ans[] = new int[arr.length];
        ans[0] = -1;

        for(int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }

            st.push(i);
        }

        
        List<Integer> li = new ArrayList<>();
        for(int val: ans){
            if(val == -1){
                li.add(-1);
            }
            else{
                li.add(arr[val]);
            }
        }
        return li;

    }
