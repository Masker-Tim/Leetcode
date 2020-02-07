#Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def __init__(self):
        self.answers = []   # 紀錄答案
        
    def inorderTraversal(self, root):
        # inorder 操作
        if(root):
            self.inorderTraversal(root.left)    # Left node 搜尋
            self.answers.append(root.val)       # View node 取得值，並放入串列
            self.inorderTraversal(root.right)   # Right node 搜尋
        return self.answers