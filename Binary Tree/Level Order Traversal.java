
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!qu.isEmpty()){
            List<Integer> al = new ArrayList<>();
            int length = qu.size();
            for(int i = 0; i < length; i++){
                TreeNode node = qu.remove();
                al.add(node.val);

                if(node.left != null){
                    qu.add(node.left);
                }
                if(node.right != null){
                    qu.add(node.right);
                }
            }
            ans.add(al);

        }

        return ans;

    }
}
