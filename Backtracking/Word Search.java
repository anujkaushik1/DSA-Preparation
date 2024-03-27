package Backtracking;

public class WordSearch {

    static boolean isWordPresentBacktrack(char board[][], int row, int col, int wordIdx, String word){

        if(wordIdx == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] !=  word.charAt(wordIdx)){
            return false;
        }
        //  yeh character word ke andr h

        board[row][col] = '#';

        // top
        if(isWordPresentBacktrack(board, row, col + 1, wordIdx + 1, word)){
            return true;
        }
        // right
        if(isWordPresentBacktrack(board, row + 1, col , wordIdx + 1, word)){
            return true;
        }

        // bottom
        if(isWordPresentBacktrack(board, row, col - 1, wordIdx + 1, word)){
            return true;
        }

        // left
        if(isWordPresentBacktrack(board, row - 1, col, wordIdx + 1, word)){
            return true;
        }
        board[row][col] = word.charAt(wordIdx);
        return false;


    }

    static boolean exists(char board[][], String word){

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                    if(isWordPresentBacktrack(board, row, col, 0, word)){
                        return  true;
                    }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        char arr[][] = {
                {'A', 'B', 'C', 'C'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(exists(arr, "ABCCED"));
    }
}
