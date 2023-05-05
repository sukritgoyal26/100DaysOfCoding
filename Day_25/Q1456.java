class Solution {
    public int maxVowels(String s, int k) {
        int max_count = 0;
        int max = Integer.MIN_VALUE;
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        for (int i = 0; i < k; i++) {
            if (hs.contains(s.charAt(i))) {
                max_count++;
            }
        }
        max = Integer.max(max_count, max);
        if (max_count == k) {
            return max_count;
        }
        for (int i = 1; i <= s.length() - k; i++) {
            if (hs.contains(s.charAt(i - 1))) {
                max_count--;
            }
            if (hs.contains(s.charAt(i + k - 1))) {
                max_count++;
                max = Integer.max(max_count, max);
            }
            if (max_count == k) {
                max = Integer.max(max_count, max);
                return max_count;
            }
        }
        return max;
    }
}