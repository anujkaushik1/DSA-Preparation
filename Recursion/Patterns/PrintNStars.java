package Recursion.Patterns;

public class PrintNStars {

    static void printStars(int row, int col, int n){

        if(row > n){       // saari rows purri hogai
            return;
        }

        if(col > n){        // uss current row mei sarre cols tk * print krdia
            System.out.println();
            printStars(row + 1, 1, n);

            System.out.println("for understanding = " + col+ "---" + row);
            return;
        }

        System.out.print("* ");
        printStars(row, col + 1, n);

    }

    public static void main(String[] args) {
        printStars(1,1,4);
    }
    
//            * * * *
//            * * * *
//            * * * *
//            * * * *
//            for understanding = 5---4
//            for understanding = 5---3
//            for understanding = 5---2
//            for understanding = 5---1

}



package Recursion.Patterns;

public class PrintNStars {

    static void lineByLine(int n, int fixed){

        if(n == 0){
            return;
        }

        printInSingle(fixed);
        System.out.println();
        lineByLine(n - 1, fixed);
    }
    static void printInSingle(int n){

        if(n == 0){
            return;
        }

        System.out.print("* ");
        printInSingle(n - 1);
    }

    public static void main(String[] args) {
        lineByLine(4,4);
    }
}
