class Solution {
  public int minDistance(String a, String b) {
    int n1 = a.length() , n2 = b.length();
    int dp[][] = new int[n1 + 1][n2 + 1];
    for (int i = 0; i <= n1; i++) dp[i][0] = i;
    for (int i = 0; i <= n2; i++) dp[0][i] = i;
    for (int i =  1; i<=n1; i++) {
      for (int j = 1; j<=n2; j++) {
        if (a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = dp[i - 1][j - 1];
        else dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
      }
    }
    
   
    return dp[n1][n2];
  }

}