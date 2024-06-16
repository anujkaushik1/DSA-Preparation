class Solution {
    public int largestRectangleArea(int[] arr) {
           Stack<Integer> st = new Stack<>();
        st.push(-1);
        st.push(0);

        int maxArea = 0;

        for(int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && st.peek() != -1 && arr[i] < arr[st.peek()]){
                int pop = st.pop();
                int right = i;
                int left = st.peek();

                int height = arr[pop];
                int width = right - left - 1;
                maxArea = Math.max(maxArea, (height * width));
            }

            st.push(i);
        }

        while (!st.isEmpty() && st.peek() != -1){
            int pop = st.pop();
            int right = arr.length;
            int left = st.peek();

            int height = arr[pop];
            int width = right - left - 1;
            maxArea = Math.max(maxArea, (height * width));
        }

        return maxArea;
    }
}



class Solution {
    public int largestRectangleArea(int[] arr) {
                Stack<Integer> st = new Stack<>();
        st.push(-1);
        st.push(0);
        int[] right = new int[arr.length];
        int[] left = new int[arr.length];

        for(int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && st.peek() != -1 && arr[i] < arr[st.peek()]){
                int pop = st.pop();
                right[pop] = i;
                left[pop] = st.peek();
            }

            st.push(i);
        }

        while (!st.isEmpty() && st.peek() != -1){
            int pop = st.pop();
            right[pop] = arr.length;
            left[pop] = st.peek();
        }

        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int rightValue = right[i];
            int leftValue = left[i];
            int height = arr[i];


            int width = rightValue - leftValue - 1;
            maxArea = Math.max(maxArea, (height * width));
        }

        return maxArea;
    }
}
