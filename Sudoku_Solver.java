class Sudoku_Solver {
     final int len=9; 
    public void solveSudoku(char[][] board) {
          solveBoard(board);
    }
     boolean solveBoard(char[][] board){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board[i][j]=='.'){
                    for(int no=1;no<=9;no++){
                       if(isValid(board,i,j,no)){
                             board[i][j]=(char)(no+'0');
                        if(solveBoard(board))
                            return true;
                        else
                            board[i][j]='.';
                        
                        }
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
    boolean isValid(char[][]board,int row,int col,int no){
     return (!cr(board,row,no)) && (!(cc(board,col,no))) && (!(cb(board,row,col,no)));    
    }
    boolean cr(char[][]b,int row,int no){
        for(int i=0;i<len;i++){
            
                if(b[row][i]==(char)(no+'0')){
                    return true;
                }
        }
        return false;
    }
    boolean cc(char[][]b,int col,int no){
        for(int i=0;i<len;i++){
            
                if(b[i][col]==(char)(no+'0')){
                    return true;
                }
          }
        return false;
    }
      boolean cb(char[][]b,int row,int col,int no){
          int tr=row-row%3;
          int tc=col-col%3;
        for(int i=tr;i<tr+3;i++){
            for(int j=tc;j<tc+3;j++){
           // int val=b[i][j]-48;
                if(b[i][j]==(char)(no+'0')){
                    return true;
                }
            }
          }
        return false;
    }
}