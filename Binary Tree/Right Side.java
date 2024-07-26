    public void rightView(Node root, int level, Queue<Integer> qu){
        if(root == null){
            return;
        }

        if(level == qu.size()){
            qu.add(root.data);
        }

        rightView(root.right, level + 1, qu);
        rightView(root.left, level + 1, qu);

    }

    public void rightViewLevelOrder(){
        if(root == null) return;
        Queue<Node> qu = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()){

            int size = qu.size();
            boolean isValueAdded = true;
            for(int i = 0; i < size; i++){
                Node top = qu.remove();
                if(isValueAdded){
                    ans.add(top.data);
                    isValueAdded = false;
                }
                if(top.right != null){
                    qu.add(top.right);
                }

                if(top.left != null){
                    qu.add(top.left);
                }
            }
        }
        while (!ans.isEmpty()){
            System.out.println(ans.remove());
        }



    }
