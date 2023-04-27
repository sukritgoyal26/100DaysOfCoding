class Solution {

    public String longestCommonPrefix(String[] strs) {
        String minstring = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (minstring.length() > (strs[i]).length()) {
                minstring = strs[i];
            }
        }
        for(int i =0 ; i<strs.length;i++){
            while(strs[i].indexOf(minstring)!=0){
                minstring = minstring.substring(0,minstring.length()-1);
            }
        }
        return minstring;
    }
}