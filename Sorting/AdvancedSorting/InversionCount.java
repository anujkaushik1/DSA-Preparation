package AdvanceSorting;

public class CountInversionSort {
    static int inversionCount = 0;
    static int[] merge(int arr[], int l, int r){

        if(l == r){
            int bres[] = new int[1];
            bres[0] = arr[l];
            return bres;
        }

        int mid = (l + r) / 2;

        int leftPart[] = merge(arr, l, mid);
        int rightPart[] = merge(arr, mid + 1, r);

        int leftRightMerged[] = merge2Arrays(leftPart, rightPart);
        return leftRightMerged;


    }

    private static int[] merge2Arrays(int[] leftPart, int[] rightPart) {

        int i = 0, j = 0, k = 0;
        int ans[] = new int[leftPart.length + rightPart.length];

        while (i < leftPart.length && j < rightPart.length){
            if(leftPart[i] < rightPart[j]){
                ans[k++] = leftPart[i++];
            }
            else{
                ans[k++] = rightPart[j++];
                inversionCount += leftPart.length - i;
            }
        }

        while (i < leftPart.length){
            ans[k++] = leftPart[i++];
        }

        while (j < rightPart.length){
            ans[k++] = rightPart[j++];
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {5,8,10,11,15,18,2,6,13,14,19};
       int test[] =  merge(arr, 0, arr.length - 1);

//        for(int val : test){
//            System.out.print(val+ "----");
//        }
//        System.out.println(arr +"------"+ test);
        System.out.println(inversionCount);

    }
}
