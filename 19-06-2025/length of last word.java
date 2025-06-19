class Solution {
    public int lengthOfLastWord(String s) {
        int e = s.length() - 1;

        while (e >= 0 && s.charAt(e) == ' ') e--;

        int i = e;
        while (i >= 0 && s.charAt(i) != ' ') i--;

        return e - i;
    }
}
