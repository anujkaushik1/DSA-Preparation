public boolean find(Node root, int element){

        if(root == null){
            return false;
        }
        System.out.print(root.data + "    ");
        if(root.data == element){
            return true;
        }

        boolean left = find(root.left, element);
        if(left){
            return true;
        }

        boolean right = find(root.right, element);
        if(right){
            return true;
        }

        return false;
    }

    public void find(int element){
        System.out.println(find(this.root, element));
    }
