class Solution {

    public void generate(int n, int op, int cl, String output, List<String> ans){
          if(cl == n){
            ans.add(output);
            return;
        }

        if(op == cl || op < n){
            generate(n, op + 1, cl, output + "(", ans);
        }
        if(op > cl){
            generate(n, op, cl + 1, output + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate(n, 0, 0, "", ans);

        return ans;
    }
}
