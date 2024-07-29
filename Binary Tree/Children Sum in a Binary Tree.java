class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    
    public static int helper(Node root){
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return root.data;
        }
        
        int left = helper(root.left);
        int right = helper(root.right);
        
        if(left + right == root.data){
            return root.data;
        }
        
        return Integer.MIN_VALUE;
    }
    
    public static int isSumProperty(Node root)
    {
        if(root == null){
            return 0;
        }
      
        int sumValue = helper(root);
        if(sumValue == root.data){
            return 1;
        }
        
        return 0;
    }
}
