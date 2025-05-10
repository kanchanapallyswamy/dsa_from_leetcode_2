class NeighborSum {
    int [][] matrix ;
    public NeighborSum(int[][] grid) {
        matrix = grid;
        return;
    }
    
    public int adjacentSum(int value) {
        String ans = get_idx(value);
        int row_idx = ans.charAt(0) - '0';
        int col_idx = ans.charAt(1) - '0';
        int r = matrix.length , c =matrix[0].length;
        int left_row_idx = row_idx , left_col_idx = col_idx - 1;
        int top_row_idx = row_idx - 1 , top_col_idx = col_idx;
        int right_row_idx = row_idx , right_col_idx = col_idx + 1; 
        int bottom_row_idx = row_idx + 1 , bottom_col_idx = col_idx;
       int sum = ((left_row_idx >= 0 && left_row_idx < r && left_col_idx >= 0 && left_col_idx < c) ? matrix[left_row_idx][left_col_idx] : 0) + 
       ((right_row_idx >= 0 && right_row_idx < r && right_col_idx >= 0 && right_col_idx < c) ? matrix[right_row_idx][right_col_idx] : 0) + 
       ((bottom_row_idx >= 0 && bottom_row_idx < r && bottom_col_idx >= 0 && bottom_col_idx < c) ? matrix[bottom_row_idx][bottom_col_idx] : 0) + 
       ((top_row_idx >= 0 && top_row_idx < r && top_col_idx >= 0 && top_col_idx < c) ? matrix[top_row_idx][top_col_idx] : 0) ;
        return sum;
    }
    
    public int diagonalSum(int value) {
        String ans = get_idx(value);
        int row_idx = ans.charAt(0) - '0';
        int col_idx = ans.charAt(1) - '0';
        int r = matrix.length , c =matrix[0].length;
        int left_row_idx = row_idx - 1 , left_col_idx = col_idx - 1;
        int top_row_idx = row_idx - 1 , top_col_idx = col_idx + 1;
        int right_row_idx = row_idx + 1 , right_col_idx = col_idx - 1; 
        int bottom_row_idx = row_idx + 1 , bottom_col_idx = col_idx + 1;
       int sum = ((left_row_idx >= 0 && left_row_idx < r && left_col_idx >= 0 && left_col_idx < c) ? matrix[left_row_idx][left_col_idx] : 0) + 
       ((right_row_idx >= 0 && right_row_idx < r && right_col_idx >= 0 && right_col_idx < c) ? matrix[right_row_idx][right_col_idx] : 0) + 
       ((bottom_row_idx >= 0 && bottom_row_idx < r && bottom_col_idx >= 0 && bottom_col_idx < c) ? matrix[bottom_row_idx][bottom_col_idx] : 0) + 
       ((top_row_idx >= 0 && top_row_idx < r && top_col_idx >= 0 && top_col_idx < c) ? matrix[top_row_idx][top_col_idx] : 0) ;
        return sum;
    }
    String get_idx(int value){
        String ans = "";
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == value){
                    ans += i+""+j+"";
                    return ans;
                }
            }
        }
        return ans;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */