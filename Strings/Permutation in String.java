// TLE

class Solution {

      public static void generate(ArrayList<String> ans, String str, int i){

        if(i == str.length() - 1){
            ans.add(str);
            return;
        }

        for(int j = i; j < str.length(); j++){
            String newString = str.charAt(j) + str.substring(0, j) + str.substring(j + 1);
            generate(ans, newString, i + 1);
        }

    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        ArrayList<String> perm = new ArrayList<>();
        generate(perm, s1, 0);

for(String str: perm){

            int i = 0, j = str.length();

            while (j <= s2.length()){
                String substring = s2.substring(i, j);
                if(substring.equals(str)){
                    return true;
                }

                i++;
                j++;
            }

        }
        return false;
    }
}
