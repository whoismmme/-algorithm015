class Solution {
    public int countSubstrings(String s) {
        if (s == null || s. length() == 0) {
            return 0;
        }
        int res = 0, n = s.length();
        for (int i = 0; i < 2 * n - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                res++;
                left--;
                right++;
            }
        }
        return res;
    }
}