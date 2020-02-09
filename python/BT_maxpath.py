class TreeNode(object):
   def __init__(self, x):
       self.val = x
       self.left = None
       self.right = None

class Solution(object):
    def __init__(self):
        self.max = float("-Inf")    # 定義最大值
    def maxPath(self,root):
        if not root: return float("-Inf")   # 若無資料，回傳最大值
        leftnode = self.maxPath(root.left)  # 左子樹最大路徑
        rightnode = self.maxPath(root.right)    # 右子樹最大路徑
        self.max = max([leftnode+rightnode+root.val,    # 將可能路徑比較，選出最大值
                       root.val,
                       leftnode+root.val,
                       rightnode+root.val,
                       self.max])
        return max(root.val,root.val+leftnode,root.val+rightnode)   # 回傳目前子樹的最大值
    def maxPathSum(self, root):
        _ = self.maxPath(root)
        return self.max if self.max!=float("-Inf") else 0   # 回傳最大值，若無節點則0