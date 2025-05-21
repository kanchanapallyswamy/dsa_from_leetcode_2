class Solution {
    public void setZeroes(int[][] m) {
        int r = m.length, c = m[0].length;
        List<Pair> l = new ArrayList<>();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(m[i][j] == 0){
                    l.add(new Pair(i,j));
                }
            }
        }
        for(var i : l){
            int row = i.row, col = i.col;
            change(m,row,col,r,c);
        }
        return;
    }
    void change(int m[][],int row, int col, int r, int c){
        for(var i = 0; i < r; i++){
            if(i == row){
                Arrays.fill(m[i],0);
            }
        }
        for(var j = 0; j < c; j++){
            if(j == col){
                for(int k = 0; k < r; k++)m[k][j] = 0;
            }
        }
    }
}
class Pair{
    int row,col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}