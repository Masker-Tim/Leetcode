public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int check(TreeNode root){
        if(root==null){return 0;}   // 如果為空節點則回傳0
        int leftdep = check(root.left); // 紀錄左子樹深度
        if(leftdep==-1){return -1;} // 左子樹不平衡回傳
        int rightdep = check(root.right);   // 紀錄右子樹深度
        if(rightdep==-1){return -1;}    // 右子樹不平衡回傳
        if(Math.abs(leftdep-rightdep)>1){return -1;}    // 左子樹與右子樹高度相減相差大於1則不平衡
        return Math.max(leftdep,rightdep)+1;    // 回傳左右子樹相比後的最大深度
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){return true;}    // 若無節點則回傳true
        return check(root)!= -1;    // 檢查是否為平衡樹
    }
}