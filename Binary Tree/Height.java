 public int height(Node root) {
    if (root == null) {
        return -1; 
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
}

public int height(Node root, int hi){
        if(root == null){
            return hi - 1;
        }

        int left = height(root.left, hi + 1);
        int right = height(root.right, hi + 1);
        return Math.max(left, right);
    }
