class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if (a.length > b.length) return findMedianSortedArrays(b, a);

        int n = a.length, m = b.length;
        int l = 0, r = n;

        while (l <= r) {
            int x = (l + r) / 2;
            int y = (n + m + 1) / 2 - x;

            int al = (x == 0) ? Integer.MIN_VALUE : a[x - 1];
            int ar = (x == n) ? Integer.MAX_VALUE : a[x];
            int bl = (y == 0) ? Integer.MIN_VALUE : b[y - 1];
            int br = (y == m) ? Integer.MAX_VALUE : b[y];

            if (al <= br && bl <= ar) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(al, bl) + Math.min(ar, br)) / 2.0;
                } else {
                    return (double) Math.max(al, bl);
                }
            } else if (al > br) {
                r = x - 1;
            } else {
                l = x + 1;
            }
        }

        return 0.0;
    }
}
