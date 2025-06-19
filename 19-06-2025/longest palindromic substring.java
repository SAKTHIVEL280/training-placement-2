class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int st = 0, e = 0;

        for (int i = 0; i < s.length(); i++) {
            int a = check(s, i, i);
            int b = check(s, i, i + 1);
            int l = Math.max(a, b);

            if (l > e - st) {
                st = i - (l - 1) / 2;
                e = i + l / 2;
            }
        }

        return s.substring(st, e + 1);
    }

    private int check(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
