class Solution {
     int max = Integer.MIN_VALUE;
    public int maxSum(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = maxSum(root.left);
        int rigthSum = maxSum(root.right);

        if(leftSum < 0) leftSum = 0;

        if(rigthSum < 0) rigthSum = 0;

        int maxi = leftSum + rigthSum + root.val;

        max = Math.max(maxi, max);

        return Math.max(leftSum, rigthSum) + root.val;

    }
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return max;
    }
