 class Pair{
        int level;
        Node node;

        public Pair(int level, Node node){
            this.level = level;
            this.node = node;
        }
    }

public void bottomView(){
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(0, root));

        map.put(0, root.data);
        int min = 0;
        int max = 0;
        while (!qu.isEmpty()){

            Pair top = qu.remove();
            Node nn = top.node;
            int level = top.level;

            if(nn.left != null){
                int newLevel = level - 1;
                min = Math.min(min, newLevel);
                qu.add(new Pair(newLevel, nn.left));
                map.put(newLevel, nn.left.data);

            }

            if(nn.right != null){
                int newLevel = level + 1;
                max = Math.max(max, newLevel);
                qu.add(new Pair(newLevel, nn.right));

                map.put(newLevel, nn.right.data);
            }
        }
//        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
            Integer al = map.get(i);
            if(al != null){
                ans.add(al);
            }
        }

        System.out.println(ans);
    }
