class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int cnt  = 0;
        for( var i = 0; i < dominoes.length; i++){
            int ele_1 = dominoes[i][0], ele_2 = dominoes[i][1];
            for(int j = i + 1; j < dominoes.length; j++){
                int ele__1 = dominoes[j][0], ele__2 = dominoes[j][1];
                if( ( ele_1 == ele__1 && ele_2 == ele__2 ) || ( ele_1 == ele__2 && ele_2 == ele__1 ) )
                    cnt++;
            }
        }
        return cnt;
    }
}