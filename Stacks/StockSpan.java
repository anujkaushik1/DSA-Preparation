class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> right = new Stack<>();
        Stack<Integer> left = new Stack<>();
        right.push(0);
        left.push(0);
        int[] rightAns = new int[arr.length];
        int[] leftAns = new int[arr.length];
        leftAns[0] = -1;

        for(int i = 1; i < arr.length; i++){
            while (!right.isEmpty() && arr[i] < arr[right.peek()]){
                int pop = right.pop();
                rightAns[pop] = i;
            }

            while (!left.isEmpty() && arr[i] <= arr[left.peek()]){
                left.pop();
            }

            if(left.isEmpty()){
                leftAns[i] = -1;
            }
            else{
                leftAns[i] = left.peek();
            }

            right.push(i);
            left.push(i);
        }

        while (!right.isEmpty()){
            rightAns[right.pop()] = arr.length;
        }

        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int rightValue = rightAns[i];
            int leftValue = leftAns[i];
            int height = arr[i];


            int width = rightValue - leftValue - 1;
            maxArea = Math.max(maxArea, (height * width));
        }   

        return maxArea;
    }
}
