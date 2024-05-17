package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 81;
        int t = 0;
        int ans = 1;

        int divide = 2;
        while(n != 1){
            boolean rem = n%divide == 0;
            if(rem){
                n = n / divide;

                if(t == divide){
                    t = 0;
                    ans *= divide;
                }
                else{
                    t = divide;
                }
            }
            else{
                divide++;
            }
        }

        if(t == 0){
            System.out.println("Root = " + ans);
        }
        else{
            System.out.println("nope");
        }
    }
}
