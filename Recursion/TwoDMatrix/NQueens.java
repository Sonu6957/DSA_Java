/* Problem :- 
    Given a chess board with n * n squares, place N queens safely.
    
    Approach :- Recursion
    Time :- O(n!)
    Space :-  O(n*n)

*/

package TwoDMatrix;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueens(board,0);
    }
    static void nQueens(boolean[][] board, int r){
        if(r==board.length){
            display(board);
            System.out.println();
        }
        for(int col = 0;col<board[0].length;col++){
            if(isSafe(board,r,col)){
                board[r][col]=true;
                nQueens(board, r+1);
                board[r][col]=false;
            }
           
        }
            
    }
    static boolean isSafe(boolean[][] board,int r, int col){
         //check vertical
            for(int j=0;j<r;j++){
                if(board[j][col]==true){
                    return false;
                }
            }
            //left diagonal
            
            int maxmovementleft=Math.min(r,col);
            for(int j=1;j<=maxmovementleft;j++){
                if(board[r-j][col-j]==true){
                    return false;
                }
            }
            //right diagonal
            int maxmovementright = Math.min(r,board.length - col-1);
            for(int j=1;j<=maxmovementright;j++){
                if(board[r-j][col+j]==true){
                    return false;
                }
            }
            return true;
    }
    static void display(boolean[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
     
}
