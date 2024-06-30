class Solution {
    List<Integer> li = new ArrayList<>();
         void printlex(int n, int i){
        if(i <= n && i != 0){
            li.add(i);
        }
        if(i > n){
            return;
        }

        for(int j = 0; j <= 9; j++){
            int res = (10 * i) + j;
            if(res == 0) continue;
            printlex(n, res);
        }

    }

    public List<Integer> lexicalOrder(int n) {
       
        printlex(n, 0);
        return li;
    }
}


package Recursion.Strings;

public class LexographicalOrder {
    static void printLexoOrder(int no,  int n){

        if(no > n){
            return;
        }
        if(no != 0)
            System.out.println(no);

        for(int i = 0; i <= 9; i++){
            if(no == 0 && i == 0){
                continue;
            }
            printLexoOrder((no * 10) + i, n);
        }
    }
    public static void main(String[] args) {
        printLexoOrder(0, 33);
    }
}
