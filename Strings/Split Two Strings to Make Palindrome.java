

// TLE !!
class Solution {

    private boolean isPalindrome(String sb){
        int i = 0, j = sb.length() - 1;

        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;

    }

    public boolean checkPalindromeFormation(String str1, String str2) {
        for(int j = 0, k = 0; j < str1.length(); j++, k++){
            String aPrefix = str1.substring(0, j);
            String aSufix = str1.substring(k, str1.length());

            String bPrefix = str2.substring(0, j);
            String bSufix = str2.substring(k, str1.length());

            String concatString1 = aPrefix + bSufix;

            if(isPalindrome(concatString1)){
                return true;
            }

            // aSufix + bPrefix false dega for (abdef, fecab)
            // 5th length - ffeca de rha h
            // but hone chaie fecaf
            String concatString2 = bPrefix +aSufix;

            if(isPalindrome(concatString2)){
                return true;
            }


        }

        return false;

    }
}
