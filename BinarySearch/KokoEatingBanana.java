class Solution {
    public static boolean isValid(int[] piles, int k, int h) {
        long total = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % k == 0) {
                total += piles[i] / k;
            } else {
                total += (piles[i] / k) + 1;
            }
        }
        return total <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int first = 1;
        int last = 0;
        int ans = -1;
        for (int i : piles) {
            last = Math.max(last, i);
        }
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (isValid(piles, mid, h)) {
                last = mid - 1;
                ans = mid;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }
}
