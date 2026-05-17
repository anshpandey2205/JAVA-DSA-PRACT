public class nQueens {

    public static boolean IsSafe(char board[][],int row,int col){
        // UPWARD
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    static int count=0;

    public static void nqueens(char board[][],int row){
        // BASE CASE
        if(row==board.length){
            //printBoard(board);
            count++;
            return;
        }

        // COLUMN LOOP
        for(int j=0;j<board.length;j++){
            if(IsSafe(board, row, j)){
            board[row][j]='Q';
            nqueens(board, row+1);
            board[row][j]='X';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("chess board");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int n=5;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueens(board, 0);
        System.out.println("TOTAL WAY TO PLACE QUEEN IS = "+count);
    }
}
