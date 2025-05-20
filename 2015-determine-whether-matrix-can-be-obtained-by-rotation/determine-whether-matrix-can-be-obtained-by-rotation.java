class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(mat, target))return true;
       for(int i = 0; i < 3 ; i++){
        mat = find(mat);
        if(check(mat, target))return true;
       }
       return false;
    }
    int [][] find(int [][]a){
        int row = a.length, col = a[0].length;
        int ans[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ans[j][i] = a[i][j];
            }
        }
        for(int i = 0; i < row; i++){
            ans[i] = reverse(ans[i]);
        }
        return ans;
    }
    int [] reverse(int a[]){
        int ans[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            ans[i] = a[a.length - 1 - i];
        }
        return ans;
    }
    boolean check(int a[][], int b[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0 ; j < a[0].length; j++){
                if(a[i][j] != b[i][j])return false;
            }
        }
        return true;
    }
}