class Solution {

    public boolean isSameTree(TreeNode p, TreeNode r) {

        if(p ==null || r == null){
          return p == r;
        }

        if(p.val != r.val){
            return false;
        }
        boolean leftPR = isSameTree(p.left, r.left);
        if(!leftPR){
            return false;
        }
        boolean rightPR = isSameTree(p.right, r.right);
        if(!rightPR){
            return false;
        }


        return true;


    }
}


class Solution {

    public boolean isSameTree(TreeNode p, TreeNode r) {

        if(p == null && r != null){
            return false;
        }

        if(r == null && p != null){
            return false;
        }

        if(p == null && r == null){
            return true;
        }

        if(p.val != r.val){
            return false;
        }
        boolean leftPR = isSameTree(p.left, r.left);
        if(!leftPR){
            return false;
        }
        boolean rightPR = isSameTree(p.right, r.right);
        if(!rightPR){
            return false;
        }


        return true;


    }
}
