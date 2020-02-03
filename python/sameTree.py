class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        if p and not q: return False    # 若p或q其中一方無樹結構(空值)，則回傳False
        elif not p and q: return False  # 同上
        elif not p and not q: return True   # 若p,q兩方皆無樹結構(空值)，則回傳True
        else:   # p,q皆有值的情況
            if p.val!=q.val:    # p,q指標所指的樹節點內的值不一樣，則回傳False
                return False
            else:   # p,q若所指的樹節點的值一致，則繼續，直到葉子節點
                return self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)