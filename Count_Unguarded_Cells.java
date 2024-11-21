/*QUESTION:
You are given two integers m and n representing a 0-indexed m x n grid. You are also given two 2D integer arrays guards and walls where guards[i] = [rowi, coli] and walls[j] = [rowj, colj] represent the positions of the ith guard and jth wall respectively.
A guard can see every cell in the four cardinal directions (north, east, south, or west) starting from their position unless obstructed by a wall or another guard. A cell is guarded if there is at least one guard that can see it.
Return the number of unoccupied cells that are not guarded.*/

class Solution {
    public int countUnguarded(int m, int n, int[][] g, int[][] w) {
        int[][]c=new int[m][n];
        for(int[]i:g){
            c[i[0]][i[1]]=2;
        }
        for(int[]i:w){
            c[i[0]][i[1]]=-1;
        }
        int ans=g.length+w.length;
        for(int[]i:g){
            int r=i[0];
            int col=i[1];
            for(int x=col-1;x>=0;x--){
                if(c[r][x]!=2 && c[r][x]!=-1){
                    if(c[r][x]!=1){
                        c[r][x]=1;
                        ans+=1;
                    }
                }else{
                    break;
                }
            }
            for(int x=col+1;x<n;x++){
                if(c[r][x]!=2 && c[r][x]!=-1){
                    if(c[r][x]!=1){
                        c[r][x]=1;
                        ans+=1;
                    }
                }
                else{
                    break;
                }
            }
            for(int x=r-1;x>=0;x--){
                if(c[x][col]!=2 && c[x][col]!=-1){
                    if(c[x][col]!=1){
                        c[x][col]=1;
                        ans+=1;
                    }
                }
                else{
                    break;
                }
            }
            for(int x=r+1;x<m;x++){
                if(c[x][col]!=2 && c[x][col]!=-1){
                    if(c[x][col]!=1){
                        c[x][col]=1;
                        ans+=1;
                    }
                }
                else{
                    break;
                }
            }
            
        }
        return (m*n)-(ans);
    }
}