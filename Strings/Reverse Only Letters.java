class Solution {
    public String reverseOnlyLetters(String str) {
        int i = 0, j = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);
        while(i < j){
            char chI = sb.charAt(i);
            char chJ = sb.charAt(j);

            if(!(chI >= 'a' && chI <= 'z') && !(chI >= 'A' && chI <= 'Z')){
                i++;
                continue;
            }

            if(!(chJ >= 'a' && chJ <= 'z') && !(chJ >= 'A' && chJ <= 'Z')){
                j--;
                continue;
            }

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }

        return sb.toString();
    }
}
