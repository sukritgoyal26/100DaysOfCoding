class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                hs.remove(nums2[i]);
            }
        }
        ArrayList<Integer> a = new ArrayList<>(hs);
        res.add(a);

        for (int i = 0; i < nums2.length; i++) {
            hs1.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (hs1.contains(nums1[i])) {
                hs1.remove(nums1[i]);
            }
        }
        ArrayList<Integer> a1 = new ArrayList<>(hs1);
        res.add(a1);

        return res;
    }
}