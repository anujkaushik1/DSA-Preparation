class Solution {
       public boolean symmetrical(TreeNode root1, TreeNode root2){

         if(root1 == null || root2 == null){
            return root1 == root2;
        }

        if(root1.val != root2.val){
            return false;
        }
        boolean v1 = symmetrical(root1.left, root2.right);
        
        if(!v1){
            return false;
        }
        
        boolean v2 = symmetrical(root1.right, root2.left);
        
        if(!v2){
            return false;
        }
        
        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        return symmetrical(root, root);
    }
}
