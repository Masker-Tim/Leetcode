public class Unique_Paths{
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1]; // 記錄之前的方法數(記錄小問題的答案)
        dp[0][0] = 0;
        if(m==0&&n==0){return 0;}   // 若都為0，則回傳0，(無長寬)
        for(int i=0;i<m;i++){dp[i][0] = 1;} // 第一列，方法數都為1
        for(int i=0;i<n;i++){dp[0][i] = 1;} // 第一欄，方法數都為1

        // 運用Dynamic Programming 計算該mxn的方法數
        for(int i=1;i<=(m-1);i++){
            for(int j=1;j<=(n-1);j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String args[]){
        System.out.println(uniquePaths(7, 3));
    }
}