package BasicSorting;

public class MergeSort {
    static int[] merge2Sorted(int A[], int B[]){
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

        return ans;
    }

    static int[] mergeSort(int arr[], int st, int en){

        if(st == en){
            int bres[] = {arr[st]};
            return bres;
        }
        int mid = (st + en)/2;
        int left[] = mergeSort(arr, st, mid);
        int right[] = mergeSort(arr, mid + 1, en);

        return merge2Sorted(left, right);
    }
    public static void main(String[] args) {
        int arr[] = {5,10,12,3,1,-1,2};

        for(int val : mergeSort(arr, 0, arr.length - 1)){
            System.out.print(val+"----");
        }

    }
}
