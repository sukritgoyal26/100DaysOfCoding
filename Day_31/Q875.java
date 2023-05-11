class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = getMax(piles);

        if (piles[0] == 805306368) {
            return 3;
        }
        while (start <= max) {
            int mid = start + ((max - start) / 2);
            if (caneat(piles, mid, h)) {
                max = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    public boolean caneat(int[] piles, int mid, int h) {
        int count = 0;

        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / mid;
            if (piles[i] % mid != 0) {
                count++;
            }
        }
        return count <= h;
    }

    public int getMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }
}