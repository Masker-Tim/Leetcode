public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){ return 0;}  // 若無節點則回傳0
        
        if(root.left==null){ return minDepth(root.right)+1;}    // 若無左節點則搜尋右節點
        else if(root.right==null){return minDepth(root.left)+1;}    // 若無右節點則搜尋左節點
        
        return Math.min(minDepth(root.right),minDepth(root.left))+1; // 取深度最小值
    }
}