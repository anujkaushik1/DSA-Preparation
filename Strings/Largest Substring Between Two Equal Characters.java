class Solution {
    public int maxLengthBetweenEqualCharacters(String str) {
        int array[] = new int[26];
        int maxRes = -1;

        for(int i = 0; i < str.length(); i++){

            int index = str.charAt(i) - 97;

            // yeh pehle character aa chuka hai iss array mei
            if(array[index] > 0){
                int value = i- array[index];
                maxRes = Math.max(maxRes, value);
            }

            else{
                array[index] = i + 1;
            }

        }

        return maxRes;
    }
}
