import java.util.*;
class Island{
    public static void main(String[] args) {
      char[][]mat={
            {'X','X','X','X'},
            {'O','O','O','X'},
            {'X','O','O','X'},
            {'X','O','X','X'},
            {'X','X','X','X'}
      };
      solve(mat);
      for(char[]ch:mat){
            System.out.println(Arrays.toString(ch));
      }
    }
    static void solve(char[][]mat){
      int m=mat.length;
      int n=mat[0].length;
      for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                  if(mat[i][j]=='O'){
                        if(isSafe(mat,i,j)){
                              mat[i][j]='X';
                        }
                  }
            }
      }
    }
    static boolean isSafe(char[][]mat,int row,int col){
      if(mat[row][col]=='X' || row>=mat.length || col>=mat[0].length || row<0 || col<0 || row>0 && mat[row-1][col]=='O'  || col>0 && mat[row][col-1]=='O')
      return false;
      mat[row][col]='X';
      return isSafe(mat, row+1, col) && isSafe(mat, row-1, col) && isSafe(mat, row, col+1) && isSafe(mat, row, col-1);
      //Upper
      // int r1=row-1,r2=row+1,c1=col-1,c2=col+1;

      // boolean up=false,right=false,left=false,down=false;
      // if(mat[r1][col]=='O'){
      //       up=false;
      // }
      // if(mat[r2 ][col]=='O'){
      //       up=false;
      // }
      // if(mat[r1][col]=='O'){
      //       up=false;
      // }
      // if(mat[r1][col]=='O'){
      //       up=false;
      // }
      // while(r1>=0){

      //       if(mat[r1][col]=='X'){
      //           up=true;
      //           break;
      //       }
      //       r1--;
      // }
      // while(r2<mat.length){
      //       if(mat[r2][col]=='X'){
      //           down=true;
      //           break;
      //       }
      //       r2++;
      // }
      // while(c1>=0){
      //       if(mat[row][c1]=='X'){
      //           left=true;
      //           break;
      //       }
      //       c1--;
      // }
      // while(c2<mat[0].length){
      //       if(mat[row][c2]=='X'){
      //           right=true;
      //           break;
      //       }
      //       c2++;
      // }
      // return left && right && up && down;
    }
}