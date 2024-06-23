class Solution
{
    public String FirstNonRepeating(String str)
    {
         
        HashMap<Character, Integer> map= new HashMap<>();
        Queue<Character> qu = new LinkedList<>();
        String ans = str.charAt(0) + "";
        map.put(str.charAt(0), 1);
        qu.add(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);

            if(!map.containsKey(ch)){
                qu.add(ch);
                map.put(ch, 1);
                ans += qu.peek();
            }
            else{
                int freq = map.get(ch);
                map.put(ch, freq + 1);
                char peek = qu.peek();

                if(map.get(peek) == 1){
                    ans += peek;
                }
                else{
                    while (!qu.isEmpty() && map.get(qu.peek()) != 1){
                        qu.remove();
                    }
                    if(qu.isEmpty()){
                        ans += '#';
                    }
                    else{
                        ans += qu.peek();
                    }
                }
            }
        }
        return ans;

    }
}
