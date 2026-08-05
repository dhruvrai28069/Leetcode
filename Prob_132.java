public class Prob_132 {

    public int minCut(String s){
        if (s == null || s.length() <= 1) {
            return 0;
        }

        int n = s.length();
        int[] cuts = new int[n];
        boolean[][] isPalindrome = new boolean[n][n];

        for (int i = 0; i < n; i++){

            int minCuts = i;

            for (int j = 0; j <= i; j++) {

                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;

                    if (j == 0) {
                        minCuts = 0;
                    } else {
                        minCuts = Math.min(minCuts, cuts[j - 1] + 1);
                    }
                }
            }
            cuts[i] = minCuts;
        }
        return cuts[n - 1];
    }
}
