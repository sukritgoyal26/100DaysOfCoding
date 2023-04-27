class Solution {
    public int strStr(String haystack, String needle) {
        boolean cont = true;
        int i = 0;
        while (cont == true && i <= haystack.length() - needle.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if ((haystack.substring(i, i + needle.length()).equals(needle))) {
                    return i;
                }
            }
            i += 1;
        }
        
        if(cont==true){
            return -1;
        }
        return 0;
    }
}