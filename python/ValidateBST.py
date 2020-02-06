class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isValidBST(self, root,minval=float("-inf"),maxval=float("inf")):
        if not root: return True
        
        if root.val <= minval or root.val >= maxval: return False   # 目前樹中的最大值與最小值
        
        # 遞迴式左右樹判斷合不合法
        return self.isValidBST(root.left,minval,min(maxval,root.val)) 
        and self.isValidBST(root.right,max(minval,root.val),maxval)