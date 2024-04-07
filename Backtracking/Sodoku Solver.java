package Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        String board[][] = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        soduku(board, 0, 0);
        display(board);
    }


    private static boolean soduku(String board[][], int row, int col){

        if(col == 9){
            row++;
            col = 0;
        }
        if(row == 9){
            return true;
        }
        if(board[row][col] == "."){

            for(int value = 1; value <= 9; value++){

                if(isSafe(value + "", board, row, col)){
                    board[row][col] = value + "";
                    boolean isPlaced = soduku(board, row, col + 1);

                    if(isPlaced){
                        return true;
                    }

                    board[row][col] = ".";

                }

            }

            return false;
        }

        return soduku(board, row, col + 1);

    }

    private static boolean isSafe(String value, String boaard[][], int row, int col){

        // horizontal -

        int tempRow = row;
        int tempCol = 0;

        while (tempCol < boaard.length){
            if(boaard[tempRow][tempCol].equals(value)){
                return false;
            }
            tempCol++;
        }

        tempRow = 0;
        tempCol = col;

        while (tempRow < boaard.length){
            if(boaard[tempRow][tempCol].equals(value)){
                return false;
            }
            tempRow++;
        }

        int bigRowCol[] = getBigBoxRowCol(row, col);
        int bigI = bigRowCol[0];
        int bigJ = bigRowCol[1];

        int bigBoxStartI = bigI * 3;
        int bigBoxStartJ = bigJ * 3;

        for(int i = bigBoxStartI; i < bigBoxStartI + 3; i++){
            for(int j = bigBoxStartJ; j < bigBoxStartJ + 3; j++){
                if(boaard[i][j].equals(value)){
                    return false;
                }
            }
        }


        return true;
    }

    private static int[] getBigBoxRowCol(int row, int col){

        return new int[]{row/3,col/3};

    }

    private static void display(String board[][]){
        for(String row[] : board){
            String ans = "[";
            for(String val : row){
                ans +=  + ", ";
            }
            ans += "]";
            System.out.println(ans);
        }
    }

}
