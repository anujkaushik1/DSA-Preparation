import java.util.* ;
import java.io.*; 

public class Solution {

    public static List<String> generateBinaryNumbers(int n) {
        List<String> ans = new ArrayList<>();
         ans.add(1 + "");
        Queue<String> qu = new LinkedList<>();
        qu.add(1 + "0");
        qu.add(1 + "1");

        for(int i = 1; i < n; i++){
            String first = qu.remove();
            ans.add(first);

            qu.add(first + "0");
            qu.add(first + "1");
        }

        return ans;

    }

}
