static List<Integer> leftSmaller(int n, int arr[])
    {
       Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        arr[0] = -1;

        for(int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] <= st.peek()){
                st.pop();
            }
            
            int tempValue = arr[i];
            if(st.isEmpty()){
                arr[i] = -1;
            }
            else{
                arr[i] = st.peek();
            }

            st.push(tempValue);
        }
        
        List<Integer> li = new ArrayList<>();
        for(int val: arr) li.add(val);
        return li;

    }
