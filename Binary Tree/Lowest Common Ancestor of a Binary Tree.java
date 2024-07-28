class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
    if(root == null){
           return null;
       }

       if(root == p || root == q){
           return root;
       }

       TreeNode leftSide = lowestCommonAncestor(root.left, p, q);
       TreeNode rightSide = lowestCommonAncestor(root.right, p, q);

       if(leftSide != null && rightSide != null){
           return root;
       }
       return leftSide == null ? rightSide : leftSide;

    }
}
