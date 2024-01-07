class Solution {
    public String customSortString(String order, String str) {
        int arr[] = new int[26];

      // frequency nikali li string ki
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++){

            // mtlb yeh jo character hai order vala woh string mei bhi present hai
            if(arr[order.charAt(i) - 'a'] > 0){

              // yeh length issleye nikali (because agar yeh krte int j = 1; j <= arr[order.charAt(i) - 'a']; j++) 
              // isse ek tym pe j ki value jada hojati array ki value se (only when the frequncey is more than 1)
              // test case - order = kqep, string = pekeq
               int length = arr[order.charAt(i) - 'a'];
	                for(int j = 1; j <= length; j++){
	                    sb.append(order.charAt(i));

                    // yeh kam issleye kr rhe hai because iss loop ke baad bhi loop lagaenge extra character ke liye
	                    arr[order.charAt(i) - 'a']--;
	                }
            }
        }

      // last mei yeh cheez issleye agar koe extra character bch gya string mei jo order mei nai hai
        for(int i = 0; i < arr.length; i++){
                for(int j = 1; j <= arr[i]; j++){
                    sb.append((char) (i + 'a'));
                }
               
        }

        return sb.toString();
    }
}
