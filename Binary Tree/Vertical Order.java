class Pair{
        int level;
        Node node;

        public Pair(int level, Node node){
            this.level = level;
            this.node = node;
        }
    }

    public void verticalOrder(){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(0, root));

        map.put(0, new ArrayList<>(List.of(root.data)));
        int min = 0;
        int max = 0;
        while (!qu.isEmpty()){

                Pair top = qu.remove();
                Node nn = top.node;
                int level = top.level;

                if(nn.left != null){
                    int newLevel = level - 1;
                    min = Math.min(min, newLevel);
                    ArrayList<Integer> list = map.get(newLevel);

                    qu.add(new Pair(newLevel, nn.left));

                    if(list != null){
                        list.add(nn.left.data);
                    }
                    else{
                        map.put(newLevel, new ArrayList<>(List.of(nn.left.data)));

                    }

                }

                if(nn.right != null){
                    int newLevel = level + 1;
                    max = Math.max(max, newLevel);

                    ArrayList<Integer> list = map.get(newLevel);

                    qu.add(new Pair(newLevel, nn.right));

                    if(list != null){
                        list.add(nn.right.data);
                    }
                    else{
                        map.put(newLevel, new ArrayList<>(List.of(nn.right.data)));
                    }
                }
            }
//        }
        ArrayList<ArrayList> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
            ArrayList<Integer> al = map.get(i);
            if(al != null){
                ans.add(al);
            }
        }

//        System.out.println(map);
//        System.out.println(min + " " + max);

        System.out.println(ans);
    }
