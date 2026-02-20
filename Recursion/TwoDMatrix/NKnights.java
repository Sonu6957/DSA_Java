package TwoDMatrix;

public class NKnights {
     public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nKnights(board,0,0,n);
    }
    static void nKnights(boolean[][] board, int r,int c,int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }
        if(r==board.length){
            return;
        }
        
        if (c == board.length){
             
                nKnights(board, r + 1, 0, knights);
                 return; 
             }
        if(isSafe(board,r,c)){
            board[r][c]=true;
            nKnights(board, r, c+1, knights-1);
            board[r][c]=false;
        }
        nKnights(board, r, c+1, knights);
        
            
    }
    static boolean isSafe(boolean[][] board,int r, int col){
         //check top-left
         if(isValid(board, r-2, col-1)){
            if(board[r-2][col-1])
            return false;
         }
         if(isValid(board, r-2, col+1)){
            if(board[r-2][col+1])
            return false;
         }
         if(isValid(board, r-1, col-2)){
            if(board[r-1][col-2])
            return false;
         }
         if(isValid(board, r-1, col+2)){
            if(board[r-1][col+2])
            return false;
         }
            return true;
    }
    static boolean isValid(boolean[][] board,int r,int c){
        if(r>=0 && r<board.length && c>=0 && c<board.length ){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
