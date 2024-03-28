package Backtracking;

public class RatInAMaze {

    static void printAns(boolean boolArray[][]){
        for(boolean arr[] : boolArray){
            for(boolean val : arr){
                System.out.print(val ? "1 " : "0 ");
            }

            System.out.println();
        }
    }

    static void solveMaze(int board[][], boolean boolArray[][], int row, int col){

        // last cell hume pta h (1) hi hoga because woh exit point hai
        if(row == board.length - 1 && col == board[0].length - 1){
            boolArray[row][col] = true;
            printAns(boolArray);
            return;
        }
        if(row >= board.length || col >= board[0].length || board[row][col] == 0 || boolArray[row][col]){
            return;
        }

        boolArray[row][col] = true;
        solveMaze(board, boolArray, row, col + 1);
        solveMaze(board, boolArray, row + 1, col);

        boolArray[row][col] = false;



    }

    public static void main(String[] args) {
        int array[][] = {
                {1,0,0,0},
                {1,1,1,1},
                {0,1,0,0},
                {0,1,1,1}
        };
        boolean bool[][] = new boolean[array.length][array[0].length];

        solveMaze(array, bool,0,0);


    }
}
