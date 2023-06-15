class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (hm.containsKey(c)) {
                sum += hm.get(c);
                hm.remove(c);
            }
        }
        return sum;
    }
}