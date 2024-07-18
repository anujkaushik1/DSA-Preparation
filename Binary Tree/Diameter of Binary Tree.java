o(n)
class Solution {
    int maxDiameter = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        maxDiameter = Math.max(left+right, maxDiameter);
        return Math.max(left, right) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }
}

o(n^2)
class Solution {
    int maxDiameter = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
    public void diameter(TreeNode root){

        if(root == null) return;

        int leftH = maxDepth(root.left);
        int rightH = maxDepth(root.right);

        maxDiameter = Math.max(maxDiameter, leftH + rightH);

        diameter(root.left);
        diameter(root.right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return maxDiameter;
    }


