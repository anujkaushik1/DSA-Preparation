
class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            int count = map.get(str.charAt(i)) == null ? 1 : map.get(str.charAt(i)) + 1;
            map.put(str.charAt(i), count);
        }
        char ans = '\0';
        int maxi = 0;
        for(char key : map.keySet()){
            int count = map.get(key);
            if(count == maxi && ans > key){
                ans = key;
            }
            if(count > maxi){
                maxi = count;
                ans = key;
            }
        }
        
        return ans;
    }
    
}
