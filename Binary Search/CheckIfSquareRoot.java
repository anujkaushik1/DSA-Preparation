package BinarySearch;

public class CheckIfSquareRoot {
    public static void main(String[] args) {
        int n = 144;
        int low = 2, high = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            int potentialCandidate = mid * mid;
            if(potentialCandidate == n){
                System.out.println(mid);
                return;
            }

            else if(potentialCandidate > n){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println("Not Valid");
    }
}
