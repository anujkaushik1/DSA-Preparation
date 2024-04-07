package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];

        nQueens(0,0,0,4, "", board);
    }

    private static void nQueens(int row, int col, int qpsf, int totalQueens, String ans, boolean board[][]) {

        if(qpsf == totalQueens){
            System.out.println(ans);
            System.out.println("-------");
            return;
        }

        if(col >= board[0].length){
            row++;
            col = 0;
        }

        if(row >=  board.length){
            return;
        }

        if(isSafeToPlace(row, col, board)){
             board[row][col] = true;
             nQueens(row + 1, 0, qpsf + 1, totalQueens, ans +  "{" + row + "--" + col + "}", board);
             board[row][col] = false;
        }
//        else{
            nQueens(row, col + 1, qpsf, totalQueens, ans, board);
//        }

    }

    private static boolean isSafeToPlace(int row, int col, boolean[][] board) {

        int tempRow = row - 1;
        int tempCol = col;

        // upwards
        while(tempRow>= 0){

            if(board[tempRow][tempCol]){
                return false;
            }
            tempRow--;

        }

        // left side (NO NEED)

//        tempRow = row;
//        tempCol = col - 1;
//
//        while(tempCol >= 0){
//            if(board[tempRow][tempCol]){
//                return false;
//            }
//            tempCol--;
//        }

        // diagonally left
        tempRow = row - 1;
        tempCol = col - 1;

        while (tempRow >= 0 && tempCol >= 0){
            if(board[tempRow][tempCol]){
                return false;
            }

            tempRow--;
            tempCol--;
        }

        // diagnoally right
        tempRow = row - 1;
        tempCol = col + 1;

        while (tempRow >= 0 && tempCol < board[0].length){
            if(board[tempRow][tempCol]){
                return false;
            }
            tempRow--;
            tempCol++;
        }

        return true;
    }
}


// leetcode sol

package Backtracking;

import java.util.ArrayList;

public class NQueens {

    static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    static ArrayList<ArrayList<String>> result = new ArrayList<>();

    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];

        nQueens(0, 0, 0, 4, new ArrayList<>(), board);

        System.out.println(result);
    }

    private static void nQueens(int row, int col, int qpsf, int totalQueens, ArrayList<String> ans, boolean board[][]) {

        if (qpsf == totalQueens) {
            result.add(new ArrayList<>(ans));
            return;
        }

        if (col >= board[0].length) {
            row++;
            col = 0;
        }

        if (row >= board.length) {
            return;
        }

        if (isSafeToPlace(row, col, board)) {
            board[row][col] = true;
            ans.add(generateRow(col, totalQueens));
            nQueens(row + 1, 0, qpsf + 1, totalQueens, ans, board);
            ans.remove(ans.size() - 1);
            board[row][col] = false;
        }
        nQueens(row, col + 1, qpsf, totalQueens, ans, board);
    }

    private static boolean isSafeToPlace(int row, int col, boolean[][] board) {

        int tempRow = row - 1;
        int tempCol = col;

        // upwards
        while (tempRow >= 0) {
            if (board[tempRow][tempCol]) {
                return false;
            }
            tempRow--;
        }

        // diagonally left
        tempRow = row - 1;
        tempCol = col - 1;

        while (tempRow >= 0 && tempCol >= 0) {
            if (board[tempRow][tempCol]) {
                return false;
            }
            tempRow--;
            tempCol--;
        }

        // diagonally right
        tempRow = row - 1;
        tempCol = col + 1;

        while (tempRow >= 0 && tempCol < board[0].length) {
            if (board[tempRow][tempCol]) {
                return false;
            }
            tempRow--;
            tempCol++;
        }

        return true;
    }

    private static String generateRow(int queenPosition, int totalQueens) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < totalQueens; i++) {
            if (i == queenPosition) {
                sb.append("Q");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
