import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
        public static boolean printRootToNode(TreeNode root, ArrayList<Integer> al, int val){

        if(root == null){
            return false;
        }

        if(root.data == val){
            al.add(root.data);
            return true;
        }

        al.add(root.data);
        boolean v1 = printRootToNode(root.left, al, val);
        if(v1){
            return true;
        }
        boolean v2 = printRootToNode(root.right, al, val);
        if(v2){
            return true;
        }
        al.remove(al.size() - 1);

        return false;
    }

    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null){
            return al;
        }

        if(root.left == null && root.right == null){
            al.add(root.data);
            return al;
        }

        printRootToNode(root, al, x);

        return al;
    }
}



