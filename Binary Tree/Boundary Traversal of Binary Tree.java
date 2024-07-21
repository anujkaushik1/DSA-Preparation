class Solution
{
        public void fillLeaves(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            ans.add(root.data);
        }

        fillLeaves(root.left, ans);
        fillLeaves(root.right, ans);

    }

	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> al = new ArrayList<>();
	    if(root == null){
	        return al;
	    }
	    
	    if(root.left == null && root.right == null){
	        al.add(root.data);
	        return al;
	    }
        Node pointer = root;
        if(pointer.left != null){
             while (pointer.left != null || pointer.right != null){
            al.add(pointer.data);
            if(pointer.left != null){
                pointer = pointer.left;
            }
            else{
                pointer = pointer.right;
            }

        }   
        }
        else{
            al.add(pointer.data);
        }

        fillLeaves(root, al);

        if(root.right == null){
            return al;
        }

        pointer = root.right;
        Stack<Integer> st = new Stack<>();

        while (pointer.left != null || pointer.right != null){
            st.push(pointer.data);
            if(pointer.right != null){
                pointer = pointer.right;
            }
            else{
                pointer = pointer.left;
            }

        }

        while (!st.isEmpty()){
            al.add(st.pop());
        }
            
        return al;
	}
}
