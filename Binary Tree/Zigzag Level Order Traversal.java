class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

         List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        boolean isFlag = true;
        while (!qu.isEmpty()){
            ArrayList<Integer> al = new ArrayList<>();
            int size = qu.size();
            for(int i = 0; i < size; i++){
                TreeNode top = qu.remove();

                    if(top.left != null){
                        qu.add(top.left);
                    }
                    if(top.right != null){
                        qu.add(top.right);

                }
                al.add(top.val);
            }
                if(!isFlag){
                    Collections.reverse(al);
                }
                ans.add(al);


            isFlag = !isFlag;

        }

        return ans;
    }
}
