class Solution {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        int res = 0;
        int[] m = new int[n];
        if (n <= 2) return n == 1 ? 1 : 2;
        m[0] = 1;
        m[1] = 2;
        for (int i = 2; i < n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }
        return m[n - 1];
    }
}