public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private ArrayList<Integer> answers = new ArrayList<Integer>(); // 定義答案
    public void preorder(TreeNode root){
        answers.add(root.val); // Visit 取得該節點的值
        if(root.left!=null){preorder(root.left);} // 尋訪Left節點
        if(root.right!=null){preorder(root.right);} // 尋訪Right節點
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){return answers;} // 若無節點則直接回傳空陣列
        preorder(root); // 執行Preorder
        return answers;
    }
}