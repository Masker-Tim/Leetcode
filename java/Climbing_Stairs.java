public class Climbing_Stairs{
    public static int climbStairs(int n) {
        if(n<=2){return n;} // n=1,n=2 output為1,2
        int[] dp = new int[n+1];    // 記錄之前步數
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];    // n=3, 其與(n=1)+(n=2)相等
        }
        return dp[n];
    }
    public static void main(String args[]){
        System.out.println(climbStairs(4));
    }
}