class Solution {

    public boolean checkInclusion(String s1, String s2) {
       int[] comp = new int[s1.length()];
        for(int k = 0; k < s1.length(); k++){
            comp[k] = s1.charAt(k) - 97;
        }
        Arrays.sort(comp);

        int i = 0, j = s1.length();

        while (j <= s2.length()){
            String sub = s2.substring(i, j);
            int[] comp2 = new int[s1.length()];
            for(int k = 0; k < sub.length(); k++){
                comp2[k] = sub.charAt(k) - 97;
            }
            Arrays.sort(comp2);

            if(Arrays.equals(comp, comp2)){
                return true;
            }

            i++;
            j++;
        }

        return false;
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int alpha[] = new int[26];

        for(int i = 0; i < s1.length(); i++){
            int index = s1.charAt(i) - 'a';
            alpha[index]++;
        }

        int i = 0, j = s1.length() - 1;

        while(j < s2.length()){

            int alpha1[] = new int[26];

            for(int k = i; k <= j; k++){
                int index = s2.charAt(k) - 'a';
                alpha1[index]++;
            }

            boolean res = Arrays.equals(alpha, alpha1);

            if(res) return true;

            j++;
            i++;

        }

        return false;

    }
}

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
