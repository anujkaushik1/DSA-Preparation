package Stacks;

import java.util.Stack;

public class PreviousSmaller {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {1,6,4,10,2,5};

        int x = 0, y = arr.length - 1;
        while (x < y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
        st.push(0);
        int[] ansIdx = new int[arr.length];
        for(int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                int popped = st.pop();
                ansIdx[popped] = arr.length - 1 - i;
            }

            st.push(i);
        }

        while (!st.isEmpty()){
            ansIdx[st.pop()] = -1;
        }

        x = 0;
        y = ansIdx.length - 1;

        while (x < y){
            int temp = ansIdx[x];
            ansIdx[x] = ansIdx[y];
            ansIdx[y] = temp;
            x++;
            y--;
        }


        for(int te : ansIdx) System.out.print(te + "   ");
    }
}
