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
