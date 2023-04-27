class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxAr = 0;

        while (start < end) {
            int h = Math.min(height[start], height[end]);
            int l = end - start;
            maxAr = Math.max(maxAr, h * l);

            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }

        }
        return maxAr;
    }
}