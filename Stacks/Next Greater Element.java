 Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] > arr[st.peek()]){
                int poppedIdx = st.pop();
                ans[poppedIdx] = arr[i];
            }

            st.push(i);
        }

        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }
