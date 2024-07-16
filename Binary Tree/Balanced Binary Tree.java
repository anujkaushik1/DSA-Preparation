
o(n)
class Solution {
     public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        if(left == -1){
            return -1;
        }
        int right = maxDepth(root.right);
        if(right == -1){
            return -1;
        }

        if(Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        return maxDepth(root) == -1 ? false : true;
    }
}


o(n^2)
class Solution {
     public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if(!left || !right){
            return false;
        }
        return true;
    }
}
