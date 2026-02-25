package Medium_Problems;

public class WordSearch {
 public static void main(String[] args) {
     char[][] board = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
     };
     String up = "SEE";
     System.out.println(res(board,up));

 }
 static boolean res(char[][] board,String word){
    for(int i = 0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(wordSearchInMatrix(board, word, i, j, 0)){
                return true;
            }
        }
    }
    return false;
 }
 static boolean wordSearchInMatrix(char[][] board, String up,int r,int c, int counter){
    //Base Case
    if(counter==up.length()){
        return true;
    }
    //Invalid checks
    if(r>=board.length||r<0||c<0||c>=board[0].length||board[r][c]!=up.charAt(counter)){
        return false;
    }
    char temp = board[r][c];
    board[r][c]='#';//Mark the current cell;
    //start traversing and collect info from each. If you get true in any of these combination return it.
    boolean res = (wordSearchInMatrix(board, up, r-1, c,counter+1)||
    wordSearchInMatrix(board, up, r+1, c,counter+1)||
    wordSearchInMatrix(board, up, r, c+1,counter+1)||
    wordSearchInMatrix(board, up, r, c-1,counter+1));
    //revert back
    board[r][c] = temp;
    return res;
            
 }
 static boolean isValid(char[][] board,int r,int c){
    if(r>=0 && r<board.length){
        if(c>=0 && c<board[0].length){
            return true;
        }
    }
    return false;
 }
}
