public class Prob_125 {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                sb.append(ch);
            }
        }

        int filteredN = sb.length();
        int i = 0;
        int j = filteredN - 1;

        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static void main(){

    }
}