class Solution {
    public String largestOddNumber(String str) {
        for(int i = str.length() - 1; i >= 0; i--){
            int num = str.charAt(i) - '0';

            if(num % 2 != 0){
                return str.substring(0, i + 1);
            }
        }

        return "";
    }
}
