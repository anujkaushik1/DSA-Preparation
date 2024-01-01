class Solution {
    public String reverseWords(String str) {
        int i = str.length() - 1, j = str.length() - 1;
        String ans = "";
        while(i >= 0){

            // remove spaces
            while(j >= 0 && str.charAt(j) == ' '){
                j--;
                i--;
            }

            // jaha pr space na ho vha tk chla jaye (i)
            while(i >= 0 && str.charAt(i) != ' '){
                i--;
            }
            
            // _ _ My name is (agar input ke starting mei spaces h)
            if(i < 0 && str.charAt(i + 1) == ' '){
                return ans;
            }
            
            // agar yeh nai krenge toh ans = _ My name is anuj
            if(ans.length() == 0){
                ans = str.substring(i + 1, j + 1);
            }
            else{
             ans = ans + " " + str.substring(i + 1, j + 1);
            }
           

            j = i;

        }

        return ans;
    }
}
