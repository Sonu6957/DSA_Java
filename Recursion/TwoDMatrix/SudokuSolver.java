package TwoDMatrix;

public class SudokuSolver {
    public static void main(String[] args) {
         int[][] board = new int[][]{
                {0, 1, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        sudokuSolverMatrix(board, 0, 0);
        
    }
    static void sudokuSolverMatrix(int[][] board,int r, int c){
        if(r==board.length){
            display(board);
            return;
        }
        if(c==board[0].length){
            sudokuSolverMatrix(board, r+1, 0);
            return;
        }
        if(board[r][c]==0){
            for(int num =1;num<=9;num++){
                if(isSafe(board,r,c,num)){
                    board[r][c]=num;
                    sudokuSolverMatrix(board, r, c+1);
                     board[r][c]=0;
                }
            } 
        }
        else{
        sudokuSolverMatrix(board, r, c+1);
        }
    }
    static void display(int[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    System.out.print(" "+board[i][j]);
            }
            System.out.println();
        }
            
    }
    


    static boolean isSafe(int[][] board,int r,int c,int num){
        for(int i=0;i<board.length;i++){
            if((board[r][i]==num)||(board[i][c]==num)){
                return false;
            }
        }
        int rowStart = r-(r%3);
        int colStart = c-(c%3);
        int rowEnd = rowStart+2;
        int colEnd = colStart + 2;
        for(int i = rowStart;i<=rowEnd;i++){
            for(int j = colStart;j<=colEnd;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
