class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hm = new HashSet<>();
        int i = 0 , j =0;
        int max = 0;

        while (j < s.length()) {
            if (hm.contains(s.charAt(j))) {
                hm.remove(s.charAt(i));
                i++;
            } else {
                hm.add(s.charAt(j));
                j++;
                max = Integer.max(max, hm.size());
            }
        }
       return max;
    }
}