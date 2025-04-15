class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length, col = mat[0].length;
        if(row * col != r * c)return mat;
        int ans[] = new int[row * col];
        int p = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[p++] = mat[i][j];
            }
        }
        int k = 0;
        int reshape[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j= 0; j < c; j++){
               if(k < ans.length ) reshape[i][j] = ans[k++];
            }
        }
        return reshape;

    }
}