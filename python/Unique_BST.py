class Solution(object):
    def numTrees(self, n):
        ans = [1]   # 定義答案
        # 計算的規律 1x1 = 1, 2x2+1x1 = 5, ...
        for i in range(1,n+1):
            ans.append(0)
            for j in range(1,i+1): ans[i] += ans[j-1] * ans[i-j]
        return ans[n]