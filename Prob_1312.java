public class Prob_1312 {

    static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] t = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }

    public int minInsertions(String s) {
        String reversedS = new StringBuilder(s).reverse().toString();

        int lpsLength = lcs(s, reversedS);

        return s.length() - lpsLength;
    }
}