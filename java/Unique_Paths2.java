public class Unique_Paths2{
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        // 若該列上有障礙及該障礙以後的，則設置為0
        for(int i=0;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==1){
                dp[i][0]=0;
                for(int j=i;j<obstacleGrid.length;j++){dp[j][0]=0;}
                break;
            }else{dp[i][0]=1;}
        }
        // 若該欄上有障礙及該障礙以後的，則設置為0
        for(int i=0;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i]==1){
                dp[0][i]=0;
                for(int j=i;j<obstacleGrid[0].length;j++){dp[0][j]=0;}
                break;
            }else{dp[0][i]=1;}
        }

        // 若該格有障礙，則設置為0；以dynamic programming演算法計算
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1){dp[i][j]=0;}
                else{dp[i][j]=dp[i-1][j]+dp[i][j-1];}
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
    public static void main(String args[]){
        int[][] test = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] test_2 = {{1,0}};
        System.out.println(uniquePathsWithObstacles(test_2));
    }
}