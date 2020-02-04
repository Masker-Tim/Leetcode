class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isSym(self,p1,p2):
        if p1==None and p2==None:   # p1 & p2 都無資料時，回傳True
            return True
        elif p1==None or p2==None:  # p1 或 p2 其一無資料時，回傳False 
            return False
        x1 = self.isSym(p1.left,p2.right)   # 因對稱而對該左子樹的左節點與右子樹的右節點相等
        x2 = self.isSym(p1.right,p2.left)   # 因對稱而對該左子樹的右節點與右子樹的左節點相等
        
        if x1 & x2 and p1.val == p2.val:    # 若該節點相等及左右子樹皆有資料，則True
            return True
        return False

    def isSymmetric(self, root):
        if not root: return True    # 當無資料時，True
        
        t1 = root.left  # 左子樹資料
        t2 = root.right # 右子樹資料
        
        return self.isSym(t1,t2)