public static int[] calculateSpan(int arr[], int n) {
         
      int x = 0, j = arr.length - 1;
        while (x < j){
            int temp = arr[x];
            arr[x] = arr[j];
            arr[j] = temp;
            x++;
            j--;
        }

        Stack<Integer> st = new Stack<>();
        st.push(0);
        int ans[] = new int[arr.length];
        for(int i = 1; i < arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.pop()] = i;
            }

            st.push(i);
        }

        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }


        x = 0;
        j = arr.length - 1;
        while (x < j){
            int temp = ans[x];
            ans[x] = ans[j];
            ans[j] = temp;
            x++;
            j--;
        }

        for(int i = 0; i < ans.length; i++){
            int index = -1;
            if(ans[i] != -1){
                index = ans.length - ans[i] - 1;
            }

            int value = i - index;
            ans[i] = value;
        }
        
        return ans;

    }
}
