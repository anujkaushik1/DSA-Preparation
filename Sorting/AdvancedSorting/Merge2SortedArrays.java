package BasicSorting;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int A[] = {1,5,7,10};
        int B[] = {2,3,9,12,16};
        int ans[] = new int[A.length + B.length];

        int i = 0, j = 0, c = 0;

        while (i < A.length && j < B.length){
            if(A[i] < B[j]){
                ans[c] = A[i];
                i++;
            }
            else{
                ans[c] = B[j];
                j++;
            }

            c++;

        }

        while (i < A.length){
            ans[c] = A[i];
            i++;
            c++;
        }
        while (j < B.length){
            ans[c] = B[j];
            j++;
            c++;
        }

        for(int val : ans){
            System.out.print(val + "---");
        }
    }
}
